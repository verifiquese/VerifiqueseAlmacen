/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.venko.almacen.controller.servlets;

import co.venko.almacen.entities.Document;
import co.venko.almacen.services.AuthUser;
import co.venko.almacen.session.DocumentFacade;
import co.venko.almacen.vo.DocumentVO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "DocumentServlet", urlPatterns = {"/ds"})
public class DocumentServlet extends HttpServlet {

    @EJB
    private DocumentFacade documentFacade;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @param mensaje
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, String mensaje)
            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
        response.setContentType("text/plain");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.print(mensaje);
        }
    }

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String user = request.getParameter("sru");
        String passwd = request.getParameter("kps");
        String firstName = request.getParameter("orh");
        String secondName = request.getParameter("bdh");
        String firstSurname = request.getParameter("wso");
        String secondSurname = request.getParameter("pur");
        String citizenID = request.getParameter("gel");
        String birthDate = request.getParameter("poe");
        String bloodType = request.getParameter("zsr");
        String bloodRH = request.getParameter("lmh");
        String country = request.getParameter("wad");
        String documentType = request.getParameter("qwe");
        String readingDate = request.getParameter("tyu");
        String latitud = request.getParameter("klz");
        String longitud = request.getParameter("sde");
        String mensaje;
        if (validateParams(user, passwd, firstName, secondName, firstSurname, secondSurname,
                citizenID, birthDate, bloodRH, bloodType, country, documentType,readingDate,latitud,longitud)) {
            if (AuthUser.validateUser(user, passwd)) {
                try {
                    documentFacade.createDocument(new DocumentVO(user, firstName, secondName,
                            firstSurname, secondSurname, citizenID, birthDate, bloodType, bloodRH, country, documentType,
                            readingDate, latitud, longitud));
                    mensaje = "OK";
                } catch (Exception e) {
                    mensaje = "ERROR";
                }
            } else {
                mensaje = "ERROR";
            }
        } else {
            System.out.println("Hay parametros nulos");
            mensaje = "ERROR";
        }
        processRequest(request, response, mensaje);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response, "");
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }

    private boolean validateParams(String user, String passwd, String firstName, String secondName, String firstSurname, String secondSurname, String citizenID,
            String birthDate, String bloodRH, String bloodType, String country, String documentType,String readingDate, String latitud, String longitud) {
        if (user != null && !"".equals(user)
                && passwd != null && !"".equals(passwd)
                && firstName != null && !"".equals(firstName)
                && firstSurname != null && !"".equals(firstSurname)
                && citizenID != null && !"".equals(citizenID)
                && birthDate != null && !"".equals(birthDate)
                && bloodRH != null && !"".equals(bloodRH)
                && bloodType != null && !"".equals(bloodType)
                && country != null && !"".equals(country)
                && documentType != null && !"".equals(documentType)
                && readingDate!=null && !"".equals(readingDate)
                && latitud!=null && !"".equals(latitud)
                && longitud!=null && !"".equals(longitud)) {
            return true;
        }
        return true;
    }

}
