package com.princejrdeveloper.controller;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.princejrdeveloper.dao.ProductoDAO;
import com.princejrdeveloper.model.Producto;



/**
 * Servlet implementation class ProductoController
 */
@WebServlet(description = "administra peticiones para la tabla productos", urlPatterns = { "/productos" })
public class Crontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Crontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opcion = request.getParameter("opcion");
		//Ir a la pagina crear
		if (opcion.equals("crear")) {
			System.out.println("Opcion Crear Elegida");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/crear.jsp");
			requestDispatcher.forward(request, response);
		
		//Ir a la pagina listar
		}else if(opcion.equals("listar")) {
			ProductoDAO productoDAO = new ProductoDAO();
			List<Producto> lista = new ArrayList<>();
			
			try {
				lista = productoDAO.obtenerProductos();
				request.setAttribute("lista", lista);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/listar.jsp");
				requestDispatcher.forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.println("La opcion Listar fue presionada");
			
		//Ir a la pagina editar
		}else if(opcion.equals("meditar")) {
			int id = Integer.parseInt(request.getParameter("id"));
			System.out.println("Se esta editando el id= "+id);
			ProductoDAO productoDAO = new ProductoDAO();
			Producto p = new Producto();
			try {
				p = productoDAO.obtenerProducto(id);
				request.setAttribute("producto", p);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/views/editar.jsp");
				requestDispatcher.forward(request, response);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		//Eliminar y luego ir a Index	
		}else if (opcion.equals("eliminar")) {
			ProductoDAO productoDAO = new ProductoDAO();
			int id = Integer.parseInt(request.getParameter("id"));
			try {
				productoDAO.eliminar(id);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
				requestDispatcher.forward(request, response);
				System.out.println("Id = "+id+" Eliminado!!");
			} catch (Exception e) {
				e.printStackTrace();
			}
		//Ir a Inicio	
		}else if (opcion.equals("inicio")) {
			System.out.println("Regresando a Inicio");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
			requestDispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String opcion = request.getParameter("opcion");
		
		//Guardar Producto
		if (opcion.equals("guardar")) {
			ProductoDAO productoDAO = new ProductoDAO();
			Producto producto = new Producto();
			producto.setNombre(request.getParameter("nombre"));
			producto.setCantidad(Integer.parseInt(request.getParameter("cantidad")));
			producto.setPrecio(Integer.parseInt(request.getParameter("precio")));
			try {
				productoDAO.guardar(producto);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
				requestDispatcher.forward(request, response);
				System.out.println("Producto Guardado con exito");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		//Editar Producto	
		}else if (opcion.equals("editar")) {
			Producto producto = new Producto();
			ProductoDAO productoDAO = new ProductoDAO();
			
			producto.setId(Integer.parseInt(request.getParameter("id")));
			producto.setNombre(request.getParameter("nombre"));
			producto.setCantidad(Integer.parseInt(request.getParameter("cantidad")));
			producto.setPrecio(Integer.parseInt(request.getParameter("precio")));
			try {
				productoDAO.editar(producto);
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("/index.jsp");
				requestDispatcher.forward(request, response);
				System.out.println("Producto Id = "+producto.getId()+ "Editado");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("No se pudo Editar");
			}
		}
		
		
		//doGet(request, response);
	}

}
