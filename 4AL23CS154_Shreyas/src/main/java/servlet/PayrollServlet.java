package servlet;

import model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/PayrollServlet")

public class PayrollServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    static List<Staff> staffList = new ArrayList<>();

    // =========================
    // ADD EMPLOYEE
    // =========================

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        int id =
                Integer.parseInt(request.getParameter("id"));

        String name =
                request.getParameter("name");

        String role =
                request.getParameter("role");

        double hours =
                Double.parseDouble(request.getParameter("hours"));

        double rate =
                Double.parseDouble(request.getParameter("rate"));

        double allowance =
                Double.parseDouble(request.getParameter("allowance"));

        double deduction =
                Double.parseDouble(request.getParameter("deduction"));

        Staff s = new Staff(
                id,
                name,
                role,
                hours,
                rate,
                allowance,
                deduction
        );

        staffList.add(s);

        response.sendRedirect("PayrollServlet?action=view");
    }

    // =========================
    // HANDLE GET REQUESTS
    // =========================

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        String action =
                request.getParameter("action");

        // =========================
        // VIEW ALL EMPLOYEES
        // =========================

        if ("view".equals(action)) {

            response.setContentType("text/html");

            response.getWriter().println("" +

                    "<html>" +

                    "<head>" +

                    "<title>All Employees</title>" +

                    "<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css' rel='stylesheet'>" +

                    "</head>" +

                    "<body class='bg-light'>" +

                    "<nav class='navbar navbar-dark bg-dark'>" +

                    "<div class='container-fluid'>" +

                    "<a href='index.jsp' class='btn btn-light'>Home</a>" +

                    "<span class='navbar-brand'>All Employees</span>" +

                    "</div>" +

                    "</nav>" +

                    "<div class='container mt-5'>" +

                    "<div class='card shadow p-4'>" +

                    "<table class='table table-bordered table-hover'>" +

                    "<tr class='table-dark'>" +

                    "<th>ID</th>" +
                    "<th>Name</th>" +
                    "<th>Role</th>" +
                    "<th>Net Salary</th>" +
                    "<th>Action</th>" +

                    "</tr>"
            );

            for (Staff s : staffList) {

                response.getWriter().println("" +

                        "<tr>" +

                        "<td>" + s.getId() + "</td>" +

                        "<td>" + s.getName() + "</td>" +

                        "<td>" + s.designation + "</td>" +

                        "<td>" + s.calculateNetSalary() + "</td>" +

                        "<td>" +

                        "<a class='btn btn-danger btn-sm' href='PayrollServlet?action=delete&id="
                        + s.getId() + "'>Delete</a>" +

                        "</td>" +

                        "</tr>"
                );
            }

            response.getWriter().println("" +

                    "</table>" +

                    "</div>" +

                    "</div>" +

                    "</body>" +

                    "</html>"
            );

            return;
        }

        // =========================
        // DELETE EMPLOYEE
        // =========================

        if ("delete".equals(action)) {

            int id =
                    Integer.parseInt(request.getParameter("id"));

            staffList.removeIf(
                    s -> s.getId() == id
            );

            response.sendRedirect(
                    "PayrollServlet?action=view"
            );

            return;
        }

        // =========================
        // SEARCH EMPLOYEE
        // =========================

        String search =
                request.getParameter("search");

        response.setContentType("text/html");

        for (Staff s : staffList) {

            if (
                    String.valueOf(s.getId()).equals(search)
                            ||
                            s.getName().equalsIgnoreCase(search)
            ) {

                response.getWriter().println("" +

                        "<html>" +

                        "<head>" +

                        "<title>Salary Report</title>" +

                        "<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css' rel='stylesheet'>" +

                        "</head>" +

                        "<body class='bg-light'>" +

                        "<nav class='navbar navbar-dark bg-dark'>" +

                        "<div class='container-fluid'>" +

                        "<a href='index.jsp' class='btn btn-light'>Home</a>" +

                        "<span class='navbar-brand'>Salary Report</span>" +

                        "</div>" +

                        "</nav>" +

                        "<div class='container mt-5'>" +

                        "<div class='card shadow p-5'>" +

                        "<h2 class='mb-4'>Employee Salary Details</h2>" +

                        "<table class='table table-bordered'>" +

                        "<tr><th>ID</th><td>" + s.getId() + "</td></tr>" +

                        "<tr><th>Name</th><td>" + s.getName() + "</td></tr>" +

                        "<tr><th>Role</th><td>" + s.designation + "</td></tr>" +

                        "<tr><th>Hours Worked</th><td>" + s.hoursWorked + "</td></tr>" +

                        "<tr><th>Hourly Rate</th><td>" + s.hourlyRate + "</td></tr>" +

                        "<tr><th>Allowances</th><td>" + s.allowances + "</td></tr>" +

                        "<tr><th>Deductions</th><td>" + s.deductions + "</td></tr>" +

                        "<tr><th>Gross Salary</th><td>" + s.calculateGrossSalary() + "</td></tr>" +

                        "<tr class='table-success'>" +

                        "<th>Net Salary</th>" +

                        "<td>" + s.calculateNetSalary() + "</td>" +

                        "</tr>" +

                        "</table>" +

                        "<button onclick='window.print()' " +

                        "class='btn btn-primary mt-3'>" +

                        "Print Salary Slip</button>" +

                        "</div>" +

                        "</div>" +

                        "</body>" +

                        "</html>"
                );

                return;
            }
        }

        response.getWriter().println("" +

                "<html>" +

                "<body class='bg-light'>" +

                "<div class='container mt-5'>" +

                "<div class='alert alert-danger'>" +

                "<h3>Employee Not Found</h3>" +

                "</div>" +

                "</div>" +

                "</body>" +

                "</html>"
        );
    }
}