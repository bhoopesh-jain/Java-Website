/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2016-12-20 10:57:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Product_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/template/header.jsp", Long.valueOf(1482230410801L));
    _jspx_dependants.put("/WEB-INF/views/template/footer.jsp", Long.valueOf(1482230410768L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("  <title>Car Store</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Lato\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Montserrat\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js\"></script>\r\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\r\n");
      out.write("  \r\n");
      out.write("  <style>\r\n");
      out.write("  .carousel-inner img {\r\n");
      out.write("      -webkit-filter: auto;\r\n");
      out.write("      filter: auto; /* make all photos black and white */\r\n");
      out.write("      width: 100%; /* Set width to 100% */\r\n");
      out.write("      margin: auto;\r\n");
      out.write("  }\r\n");
      out.write("  .carousel-caption h3 {\r\n");
      out.write("      color: #fff !important;\r\n");
      out.write("  }\r\n");
      out.write("  @media (max-width: 600px) {\r\n");
      out.write("    .carousel-caption {\r\n");
      out.write("      display: none; /* Hide the carousel text when the screen is less than 600 pixels wide */\r\n");
      out.write("    }\r\n");
      out.write("  }\r\n");
      out.write("  .navbar {\r\n");
      out.write("      font-family: Montserrat, sans-serif;\r\n");
      out.write("      margin-bottom: 0;\r\n");
      out.write("      background-color: #000000;\r\n");
      out.write("      border: 0;\r\n");
      out.write("      font-size: 11px !important;\r\n");
      out.write("      letter-spacing: 4px;\r\n");
      out.write("      opacity: 0.9;\r\n");
      out.write("  }\r\n");
      out.write("  .navbar li a, .navbar .navbar-brand {\r\n");
      out.write("      color: #d5d5d5 !important;\r\n");
      out.write("  }\r\n");
      out.write("  .navbar-nav li a:hover {\r\n");
      out.write("      color: #20B2AA !important;\r\n");
      out.write("  }\r\n");
      out.write("  .navbar-nav li.active a {\r\n");
      out.write("      color: #fff !important;\r\n");
      out.write("      background-color:\t\t #00aaff !important;\r\n");
      out.write("  }\r\n");
      out.write("  .navbar-default .navbar-toggle {\r\n");
      out.write("      border-color: transparent;\r\n");
      out.write("  }\r\n");
      out.write("  .open .dropdown-toggle {\r\n");
      out.write("      color: #fff;\r\n");
      out.write("      background-color: #555 !important;\r\n");
      out.write("  }\r\n");
      out.write("  .dropdown-menu li a {\r\n");
      out.write("      color: #F08080 !important;\r\n");
      out.write("  }\r\n");
      out.write("  .dropdown-menu li a:hover {\r\n");
      out.write("      background-color:#FFCCFF !important;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  </style>\r\n");
      out.write("</head>\r\n");
      out.write("<!-- NAVBAR\r\n");
      out.write("================================================== -->\r\n");
      out.write("<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"50\">\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("      </button>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"#myPage\">logo</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("      <ul class=\"nav navbar-nav navbar-left\">\r\n");
      out.write("        <li><a href=\"/carshop\">Home</a></li>\r\n");
      out.write("        <li><a href=\"#\">About Us</a></li>\r\n");
      out.write("        <li><a href=\"#\">Contact Us</a></li>\r\n");
      out.write("\t\t <li class=\"dropdown\">\r\n");
      out.write("          <a class=\"dropdown-toggle\" data-toggle=\"dropdown\" href=\"Product\">Products\r\n");
      out.write("          <span class=\"caret\"></span></a>\r\n");
      out.write("          <ul class=\"dropdown-menu\">\r\n");
      out.write("            <li><a href=\"Product\">dss</a></li>\r\n");
      out.write("            <li><a href=\"Product\">dssj</a></li>\r\n");
      out.write("            <li><a href=\"Product\">jhdhbj</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("      <li><a href=\"#\"><span class=\"glyphicon glyphicon-user\"></span> Sign Up</a></li>\r\n");
      out.write("      <li><a href=\"#\"><span class=\"glyphicon glyphicon-log-in\"></span> Login</a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("\t<div class=\"col-sm-3 col-md-3 pull-right\">\r\n");
      out.write("        <form class=\"navbar-form\" role=\"search\">\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("         <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"srch-term\" id=\"srch-term\">\r\n");
      out.write("         <div class=\"input-group-btn\">\r\n");
      out.write("         <button class=\"btn btn-default\" type=\"submit\"><i class=\"glyphicon glyphicon-search\"></i></button>\r\n");
      out.write("         </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        </form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("var prod=${productData};\r\n");
      out.write("angular.module(\"productApp\",[])\r\n");
      out.write("\r\n");
      out.write(".controller(\"productController\",function($scope){\r\n");
      out.write("\r\n");
      out.write("\t$scope.prodData=prod;\r\n");
      out.write("\t$scope.sort=function(keyname){\r\n");
      out.write("\t\t$scope.sortKey=keyname;\r\n");
      out.write("\t\t$scope.reverse=!$scope.reverse;\r\n");
      out.write("\t}\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<div class =\"section\" style=\"padding-top:100px\" ng-app=\"productApp\">\r\n");
      out.write("\r\n");
      out.write("<div class =\"row\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"col-sm-4\">\r\n");
      out.write("      <input type=\"text\" class=\"form-control\" ng-model=\"search\" placeholder=\"Enter Search Criteria\">\r\n");
      out.write("    </div>\r\n");
      out.write("\t<div class =\"col-sm-8\">\r\n");
      out.write("\t</div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("<div style=\"padding-left:100px\"  ng-controller = \"productController\" class=\"row\" style=\"padding-top:100px\">\r\n");
      out.write("\t<table class =\"table table-striped\">\r\n");
      out.write("\t<thead>\r\n");
      out.write("\t   <tr>\r\n");
      out.write("\t\t<th ng-click=\"sort('productName')\">Product Name</th>\r\n");
      out.write("\t\t<th ng-click=\"sort('brand')\">Brand</th>\r\n");
      out.write("\t\t<th ng-click=\"sort('price')\">Price</th>\r\n");
      out.write("\t\t<th ng-click=\"sort('category')\">Category</th>\r\n");
      out.write("\t\t<th></th>\r\n");
      out.write("\t   </tr>\r\n");
      out.write("\t</thead>\r\n");
      out.write("\r\n");
      out.write("\t<tbody>\r\n");
      out.write("     <tr ng-repeat=\"product in prodData|orderBy:sortKey:reverse|filter:search\">\r\n");
      out.write("\t<td>{{product.productName}}</td>\r\n");
      out.write("\t<td>{{product.brand}}</td>\r\n");
      out.write("\t<td>{{product.price}}</td>\r\n");
      out.write("\t<td>{{product.category}}</td>\r\n");
      out.write("     </tr>\r\n");
      out.write("     \r\n");
      out.write("\t</tbody>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/demo.css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"resources/css/footer-distributed.css\">\r\n");
      out.write("\t\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- The content of your page would go here. -->\r\n");
      out.write("\r\n");
      out.write("\t\t<footer class=\"footer-distributed\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"footer-right\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\r\n");
      out.write("\t\t\t\t<a href=\"#\"><i class=\"fa fa-github\"></i></a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"footer-left\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p>Company Name &copy; 2016</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("\r\n");
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
