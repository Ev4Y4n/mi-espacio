package proyectos.practica.web_notas.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SerieDTO {

	private Integer id;

	private String name;

	private String image;

	private BigDecimal rating;

	private LocalDate addDate;
	
	private Integer season;
	
	private Integer episode;

	private Boolean ended;
}
