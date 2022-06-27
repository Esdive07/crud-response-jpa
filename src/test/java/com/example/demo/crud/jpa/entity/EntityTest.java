package com.example.demo.crud.jpa.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EntityTest {

	private UserEntity userEntity;

	@BeforeEach
	public void init() {
		this.userEntity = new UserEntity();
	}

	@Test
	public void userEntity() {
		Integer id = 1;
		String nombre = "Esme";
		String apellido = "Diaz";
		String edad = "28";
		String documento = "1026";

		List<DireccionEntity> direccionEntities = new ArrayList<>();
		List<DatosContactoEntity> datosContactoEntities = new ArrayList<>();

		this.userEntity.setId(id);
		this.userEntity.setNombre(nombre);
		this.userEntity.setApellido(apellido);
		this.userEntity.setEdad(edad);
		this.userEntity.setDocumento(documento);
		this.userEntity.setDireccionEntities(direccionEntities);
		this.userEntity.setDatosContactoEntities(datosContactoEntities);

		assertEquals(id, this.userEntity.getId());
		assertEquals(nombre, this.userEntity.getNombre());
		assertEquals(apellido, this.userEntity.getApellido());
		assertEquals(edad, this.userEntity.getEdad());
		assertEquals(documento, this.userEntity.getDocumento());
		assertNotNull(this.userEntity.getDireccionEntities());
		assertNotNull(this.userEntity.getDatosContactoEntities());

	}

}
