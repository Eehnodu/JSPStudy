/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-03-11 02:09:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.template.demo_005f1.pages.charts;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class chartjs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <!-- Required meta tags -->\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\n");
      out.write("    <title>Plus Admin</title>\n");
      out.write("    <!-- plugins:css -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../../assets/vendors/mdi/css/materialdesignicons.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../../assets/vendors/flag-icon-css/css/flag-icon.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../../assets/vendors/css/vendor.bundle.base.css\">\n");
      out.write("    <!-- endinject -->\n");
      out.write("    <!-- Plugin css for this page -->\n");
      out.write("    <!-- End Plugin css for this page -->\n");
      out.write("    <!-- inject:css -->\n");
      out.write("    <!-- endinject -->\n");
      out.write("    <!-- Layout styles -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../../assets/css/demo_1/style.css\" />\n");
      out.write("    <!-- End layout styles -->\n");
      out.write("    <link rel=\"shortcut icon\" href=\"../../../assets/images/favicon.png\" />\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div class=\"container-scroller\">\n");
      out.write("      <!-- partial:../../partials/_sidebar.html -->\n");
      out.write("      <nav class=\"sidebar sidebar-offcanvas\" id=\"sidebar\">\n");
      out.write("        <ul class=\"nav\">\n");
      out.write("          <li class=\"nav-item nav-profile border-bottom\">\n");
      out.write("            <a href=\"#\" class=\"nav-link flex-column\">\n");
      out.write("              <div class=\"nav-profile-image\">\n");
      out.write("                <img src=\"../../../assets/images/faces/face1.jpg\" alt=\"profile\" />\n");
      out.write("                <!--change to offline or busy as needed-->\n");
      out.write("              </div>\n");
      out.write("              <div class=\"nav-profile-text d-flex ms-0 mb-3 flex-column\">\n");
      out.write("                <span class=\"font-weight-semibold mb-1 mt-2 text-center\">Antonio Olson</span>\n");
      out.write("                <span class=\"text-secondary icon-sm text-center\">$3499.00</span>\n");
      out.write("              </div>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item pt-3\">\n");
      out.write("            <a class=\"nav-link d-block\" href=\"../../index.jsp\">\n");
      out.write("              <img class=\"sidebar-brand-logo\" src=\"../../../assets/images/logo.svg\" alt=\"\" />\n");
      out.write("              <img class=\"sidebar-brand-logomini\" src=\"../../../assets/images/logo-mini.svg\" alt=\"\" />\n");
      out.write("              <div class=\"small font-weight-light pt-1\">Responsive Dashboard</div>\n");
      out.write("            </a>\n");
      out.write("            <form class=\"d-flex align-items-center\" action=\"#\">\n");
      out.write("              <div class=\"input-group\">\n");
      out.write("                <div class=\"input-group-prepend\">\n");
      out.write("                  <i class=\"input-group-text border-0 mdi mdi-magnify\"></i>\n");
      out.write("                </div>\n");
      out.write("                <input type=\"text\" class=\"form-control border-0\" placeholder=\"Search\" />\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"../../index.jsp\">\n");
      out.write("              <i class=\"mdi mdi-compass-outline menu-icon\"></i>\n");
      out.write("              <span class=\"menu-title\">나의운동상태</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"../../pages/charts/chartjs.jsp\">\n");
      out.write("              <i class=\"mdi mdi-chart-bar menu-icon\"></i>\n");
      out.write("              <span class=\"menu-title\">표준데이터</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("  \n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("      <!-- partial -->\n");
      out.write("      <div class=\"container-fluid page-body-wrapper\">\n");
      out.write("        <!-- partial:../../partials/_settings-panel.html -->\n");
      out.write("        <div id=\"settings-trigger\"><i class=\"mdi mdi-settings\"></i></div>\n");
      out.write("        <div id=\"theme-settings\" class=\"settings-panel\">\n");
      out.write("          <i class=\"settings-close mdi mdi-close\"></i>\n");
      out.write("          <p class=\"settings-heading\">SIDEBAR SKINS</p>\n");
      out.write("          <div class=\"sidebar-bg-options selected\" id=\"sidebar-default-theme\">\n");
      out.write("            <div class=\"img-ss rounded-circle bg-light border me-3\"></div>Default\n");
      out.write("          </div>\n");
      out.write("          <div class=\"sidebar-bg-options\" id=\"sidebar-dark-theme\">\n");
      out.write("            <div class=\"img-ss rounded-circle bg-dark border me-3\"></div>Dark\n");
      out.write("          </div>\n");
      out.write("          <p class=\"settings-heading mt-2\">HEADER SKINS</p>\n");
      out.write("          <div class=\"color-tiles mx-0 px-4\">\n");
      out.write("            <div class=\"tiles default primary\"></div>\n");
      out.write("            <div class=\"tiles success\"></div>\n");
      out.write("            <div class=\"tiles warning\"></div>\n");
      out.write("            <div class=\"tiles danger\"></div>\n");
      out.write("            <div class=\"tiles info\"></div>\n");
      out.write("            <div class=\"tiles dark\"></div>\n");
      out.write("            <div class=\"tiles light\"></div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- partial -->\n");
      out.write("        <!-- partial:../../partials/_navbar.html -->\n");
      out.write("        <nav class=\"navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row\">\n");
      out.write("          <div class=\"navbar-menu-wrapper d-flex align-items-stretch\">\n");
      out.write("            <button class=\"navbar-toggler navbar-toggler align-self-center\" type=\"button\" data-toggle=\"minimize\">\n");
      out.write("              <span class=\"mdi mdi-chevron-double-left\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"text-center navbar-brand-wrapper d-flex align-items-center justify-content-center\">\n");
      out.write("              <a class=\"navbar-brand brand-logo-mini\" href=\"../../index.jsp\"><img src=\"../../../assets/images/logo-mini.svg\" alt=\"logo\" /></a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"navbar-nav\">\n");
      out.write("              <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link\" id=\"messageDropdown\" href=\"#\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                  <i class=\"mdi mdi-email-outline\"></i>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu dropdown-menu-left navbar-dropdown preview-list\" aria-labelledby=\"messageDropdown\">\n");
      out.write("                  <h6 class=\"p-3 mb-0 font-weight-semibold\">Messages</h6>\n");
      out.write("                  <div class=\"dropdown-divider\"></div>\n");
      out.write("                  <a class=\"dropdown-item preview-item\">\n");
      out.write("                    <div class=\"preview-thumbnail\">\n");
      out.write("                      <img src=\"../../../assets/images/faces/face1.jpg\" alt=\"image\" class=\"profile-pic\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\n");
      out.write("                      <h6 class=\"preview-subject ellipsis mb-1 font-weight-normal\">Mark send you a message</h6>\n");
      out.write("                      <p class=\"text-gray mb-0\"> 1 Minutes ago </p>\n");
      out.write("                    </div>\n");
      out.write("                  </a>\n");
      out.write("                  <div class=\"dropdown-divider\"></div>\n");
      out.write("                  <a class=\"dropdown-item preview-item\">\n");
      out.write("                    <div class=\"preview-thumbnail\">\n");
      out.write("                      <img src=\"../../../assets/images/faces/face6.jpg\" alt=\"image\" class=\"profile-pic\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\n");
      out.write("                      <h6 class=\"preview-subject ellipsis mb-1 font-weight-normal\">Cregh send you a message</h6>\n");
      out.write("                      <p class=\"text-gray mb-0\"> 15 Minutes ago </p>\n");
      out.write("                    </div>\n");
      out.write("                  </a>\n");
      out.write("                  <div class=\"dropdown-divider\"></div>\n");
      out.write("                  <a class=\"dropdown-item preview-item\">\n");
      out.write("                    <div class=\"preview-thumbnail\">\n");
      out.write("                      <img src=\"../../../assets/images/faces/face7.jpg\" alt=\"image\" class=\"profile-pic\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\n");
      out.write("                      <h6 class=\"preview-subject ellipsis mb-1 font-weight-normal\">Profile picture updated</h6>\n");
      out.write("                      <p class=\"text-gray mb-0\"> 18 Minutes ago </p>\n");
      out.write("                    </div>\n");
      out.write("                  </a>\n");
      out.write("                  <div class=\"dropdown-divider\"></div>\n");
      out.write("                  <h6 class=\"p-3 mb-0 text-center text-primary font-13\">4 new messages</h6>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item dropdown ms-3\">\n");
      out.write("                <a class=\"nav-link\" id=\"notificationDropdown\" href=\"#\" data-bs-toggle=\"dropdown\">\n");
      out.write("                  <i class=\"mdi mdi-bell-outline\"></i>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu dropdown-menu-left navbar-dropdown preview-list\" aria-labelledby=\"notificationDropdown\">\n");
      out.write("                  <h6 class=\"px-3 py-3 font-weight-semibold mb-0\">Notifications</h6>\n");
      out.write("                  <div class=\"dropdown-divider\"></div>\n");
      out.write("                  <a class=\"dropdown-item preview-item\">\n");
      out.write("                    <div class=\"preview-thumbnail\">\n");
      out.write("                      <div class=\"preview-icon bg-success\">\n");
      out.write("                        <i class=\"mdi mdi-calendar\"></i>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\n");
      out.write("                      <h6 class=\"preview-subject font-weight-normal mb-0\">New order recieved</h6>\n");
      out.write("                      <p class=\"text-gray ellipsis mb-0\"> 45 sec ago </p>\n");
      out.write("                    </div>\n");
      out.write("                  </a>\n");
      out.write("                  <div class=\"dropdown-divider\"></div>\n");
      out.write("                  <a class=\"dropdown-item preview-item\">\n");
      out.write("                    <div class=\"preview-thumbnail\">\n");
      out.write("                      <div class=\"preview-icon bg-warning\">\n");
      out.write("                        <i class=\"mdi mdi-settings\"></i>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\n");
      out.write("                      <h6 class=\"preview-subject font-weight-normal mb-0\">Server limit reached</h6>\n");
      out.write("                      <p class=\"text-gray ellipsis mb-0\"> 55 sec ago </p>\n");
      out.write("                    </div>\n");
      out.write("                  </a>\n");
      out.write("                  <div class=\"dropdown-divider\"></div>\n");
      out.write("                  <a class=\"dropdown-item preview-item\">\n");
      out.write("                    <div class=\"preview-thumbnail\">\n");
      out.write("                      <div class=\"preview-icon bg-info\">\n");
      out.write("                        <i class=\"mdi mdi-link-variant\"></i>\n");
      out.write("                      </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"preview-item-content d-flex align-items-start flex-column justify-content-center\">\n");
      out.write("                      <h6 class=\"preview-subject font-weight-normal mb-0\">Kevin karvelle</h6>\n");
      out.write("                      <p class=\"text-gray ellipsis mb-0\"> 11:09 PM </p>\n");
      out.write("                    </div>\n");
      out.write("                  </a>\n");
      out.write("                  <div class=\"dropdown-divider\"></div>\n");
      out.write("                  <h6 class=\"p-3 font-13 mb-0 text-primary text-center\">View all notifications</h6>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("            <ul class=\"navbar-nav navbar-nav-right\">\n");
      out.write("              <li class=\"nav-item nav-logout d-none d-md-block me-3\">\n");
      out.write("                <a class=\"nav-link\" href=\"#\">Status</a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item nav-logout d-none d-md-block\">\n");
      out.write("                <button class=\"btn btn-sm btn-danger\">Trailing</button>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item nav-profile dropdown d-none d-md-block\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" id=\"profileDropdown\" href=\"#\" data-bs-toggle=\"dropdown\" aria-expanded=\"false\">\n");
      out.write("                  <div class=\"nav-profile-text\">English </div>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu center navbar-dropdown\" aria-labelledby=\"profileDropdown\">\n");
      out.write("                  <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                    <i class=\"flag-icon flag-icon-bl me-3\"></i> French </a>\n");
      out.write("                  <div class=\"dropdown-divider\"></div>\n");
      out.write("                  <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                    <i class=\"flag-icon flag-icon-cn me-3\"></i> Chinese </a>\n");
      out.write("                  <div class=\"dropdown-divider\"></div>\n");
      out.write("                  <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                    <i class=\"flag-icon flag-icon-de me-3\"></i> German </a>\n");
      out.write("                  <div class=\"dropdown-divider\"></div>\n");
      out.write("                  <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                    <i class=\"flag-icon flag-icon-ru me-3\"></i>Russian </a>\n");
      out.write("                </div>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"nav-item nav-logout d-none d-lg-block\">\n");
      out.write("                <a class=\"nav-link\" href=\"../../index.jsp\">\n");
      out.write("                  <i class=\"mdi mdi-home-circle\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("            <button class=\"navbar-toggler navbar-toggler-right d-lg-none align-self-center\" type=\"button\" data-toggle=\"offcanvas\">\n");
      out.write("              <span class=\"mdi mdi-menu\"></span>\n");
      out.write("            </button>\n");
      out.write("          </div>\n");
      out.write("        </nav>\n");
      out.write("        <!-- partial -->\n");
      out.write("        <div class=\"main-panel\">\n");
      out.write("          <div class=\"content-wrapper\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-lg-6 grid-margin stretch-card\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                    <h4 class=\"card-title\">Line chart</h4>\n");
      out.write("                    <canvas id=\"lineChart\" style=\"height: 250px;\"></canvas>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-lg-6 grid-margin stretch-card\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                    <h4 class=\"card-title\">Bar chart</h4>\n");
      out.write("                    <canvas id=\"barChart\" style=\"height: 230px;\"></canvas>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-lg-6 grid-margin stretch-card\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                    <h4 class=\"card-title\">Area chart</h4>\n");
      out.write("                    <canvas id=\"areaChart\" style=\"height: 250px;\"></canvas>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-lg-6 grid-margin stretch-card\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                    <h4 class=\"card-title\">Doughnut chart</h4>\n");
      out.write("                    <canvas id=\"doughnutChart\" style=\"height: 250px;\"></canvas>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("              <div class=\"col-lg-6 grid-margin stretch-card\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                    <h4 class=\"card-title\">Pie chart</h4>\n");
      out.write("                    <canvas id=\"pieChart\" style=\"height: 250px;\"></canvas>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-lg-6 grid-margin stretch-card\">\n");
      out.write("                <div class=\"card\">\n");
      out.write("                  <div class=\"card-body\">\n");
      out.write("                    <h4 class=\"card-title\">Scatter chart</h4>\n");
      out.write("                    <canvas id=\"scatterChart\" style=\"height: 250px;\"></canvas>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <!-- content-wrapper ends -->\n");
      out.write("          <!-- partial:../../partials/_footer.html -->\n");
      out.write("          <footer class=\"footer\">\n");
      out.write("            <div class=\"d-sm-flex justify-content-center justify-content-sm-between\">\n");
      out.write("              <span class=\"text-muted text-center text-sm-left d-block d-sm-inline-block\">Copyright © 2021 <a href=\"https://www.bootstrapdash.com/\" target=\"_blank\">BootstrapDash</a>. All rights reserved.</span>\n");
      out.write("              <span class=\"float-none float-sm-right d-block mt-1 mt-sm-0 text-center\">Hand-crafted & made with <i class=\"mdi mdi-heart text-danger\"></i></span>\n");
      out.write("            </div>\n");
      out.write("          </footer>\n");
      out.write("          <!-- partial -->\n");
      out.write("        </div>\n");
      out.write("        <!-- main-panel ends -->\n");
      out.write("      </div>\n");
      out.write("      <!-- page-body-wrapper ends -->\n");
      out.write("    </div>\n");
      out.write("    <!-- container-scroller -->\n");
      out.write("    <!-- plugins:js -->\n");
      out.write("    <script src=\"../../../assets/vendors/js/vendor.bundle.base.js\"></script>\n");
      out.write("    <!-- endinject -->\n");
      out.write("    <!-- Plugin js for this page -->\n");
      out.write("    <script src=\"../../../assets/vendors/chart.js/Chart.min.js\"></script>\n");
      out.write("    <!-- End plugin js for this page -->\n");
      out.write("    <!-- inject:js -->\n");
      out.write("    <script src=\"../../../assets/js/off-canvas.js\"></script>\n");
      out.write("    <script src=\"../../../assets/js/hoverable-collapse.js\"></script>\n");
      out.write("    <script src=\"../../../assets/js/misc.js\"></script>\n");
      out.write("    <script src=\"../../../assets/js/settings.js\"></script>\n");
      out.write("    <script src=\"../../../assets/js/todolist.js\"></script>\n");
      out.write("    <!-- endinject -->\n");
      out.write("    <!-- Custom js for this page -->\n");
      out.write("    <script src=\"../../../assets/js/chart.js\"></script>\n");
      out.write("    <!-- End custom js for this page -->\n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}