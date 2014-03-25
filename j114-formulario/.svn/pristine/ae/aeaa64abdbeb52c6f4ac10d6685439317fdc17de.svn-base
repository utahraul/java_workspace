package com.atrium.modelo;

import java.io.IOException;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.helpers.XMLReaderFactory;

public class Datos_DAO extends DefaultHandler {

	private String etiqueta_leida;
	private Datos_DTO datos;

	public Datos_DAO() {
		datos = new Datos_DTO();
	}

	public Datos_DTO leer_Datos() {
		try {
			XMLReader lector = XMLReaderFactory.createXMLReader();
			lector.setContentHandler(this);
			lector.parse(this.getClass()
					.getResource("/com/atrium/vista/datos.xml").getFile());
		} catch (SAXException e) {
			e.printStackTrace();
			datos = null;
		} catch (IOException e) {
			e.printStackTrace();
			datos = null;
		}
		return datos;
	}

	
	public boolean escribir_Datos(Datos_DTO datos_nuevos){
		boolean valido=true;
		
		
		
		return valido;
	}
	
	
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		etiqueta_leida = localName;
	}

	@Override
	public void characters(char[] texto, int inicio, int tamaño)
			throws SAXException {
		String texto_eti = new String(texto, inicio, tamaño);
		if (etiqueta_leida.equals("fecha")) {
			datos.setFecha(texto_eti);
		}
		if (etiqueta_leida.equals("autor")) {
			datos.setAutor(texto_eti);
		}
		if (etiqueta_leida.equals("nombre")) {
			datos.setNombre(texto_eti);
		}
		if (etiqueta_leida.equals("apellido")) {
			datos.setApellido(texto_eti);
		}
		if (etiqueta_leida.equals("calle")) {
			datos.setCalle(texto_eti);
		}
		if (etiqueta_leida.equals("ciudad")) {
			datos.setCiudad(texto_eti);
		}
	}

}
