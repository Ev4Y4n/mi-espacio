package proyectos.practica.web_notas.dtos;

import java.time.LocalDateTime;

import proyectos.practica.web_notas.dtos.enums.FavoriteCategoryENUM;

public class FavoriteDTO {

	private Integer id;
	
	private FavoriteCategoryENUM category;
	
    private Integer itemId;
	
	private LocalDateTime addDate;
}
