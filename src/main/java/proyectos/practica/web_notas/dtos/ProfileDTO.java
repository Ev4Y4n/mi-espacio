package proyectos.practica.web_notas.dtos;

import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ProfileDTO {

	private Integer id;
	
	private String name;
	
	private String avatar;
	
	private String email;
	
	private String password;
	
	private BigInteger bookCounter;
	
	private BigInteger movieCounter;

	private BigInteger seriesCounter;
	
	private BigInteger videogameCounter;
	
	private List<BookDTO> books = new ArrayList<>();
	
	private List<MovieDTO> movies = new ArrayList<>();

	private List<SerieDTO> series = new ArrayList<>();

	private List<VideogameDTO> videogames = new ArrayList<>();
	
	private LocalDateTime creationDate;

}
