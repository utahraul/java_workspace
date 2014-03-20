package com.atrium.modelo;

import java.util.Properties;

public class EtiquetaDinamica_DAO {

	// OBJETO PARA EL PROCESO DE LECTURA DEL PROPERTIES
	private Properties flujo_lectura;
	// DTO PARA EL TRANSPORTE DE LOS DATOS LEIDOS
	private EtiquetaDinamica_DTO etidin_dto;

	/**
	 * Constructor en donde se instancian las propiedades de clase necesarias
	 * para el proceso a realizar.
	 */
	public EtiquetaDinamica_DAO() {
		flujo_lectura = new Properties();
		etidin_dto = new EtiquetaDinamica_DTO();
	}

	/**
	 * Proceso donde leemos del fichero de configuracion y a continuacion se
	 * pasan los valores leidos a propiedades de clase que seran visibles
	 * mediante accesores.
	 * 
	 * @throws IOException
	 */
	public EtiquetaDinamica_DTO cargar_Configuracion() {
		// CARGAMOS LOS DATOS DEL FICHERO
		try {
			flujo_lectura.load(this.getClass().getResourceAsStream(
					"/com/atrium/modelo/etiquetadinamica.properties"));
			// PASAMOS LA INFORMACION A LAS PROPIEDADES DEL DTO
			etidin_dto.setEtiqueta(flujo_lectura.getProperty("valoretiqueta"));

		} catch (Exception e) {
			// TRATAMIENTO DE ERROR EN LA CARGA DEL FICHERO
			etidin_dto = null;
		}

		return etidin_dto;
	}

}
