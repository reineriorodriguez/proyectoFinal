package com.proyectoFinal.Entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ {

	public static volatile ListAttribute<Usuario, HistorialReserva> historialReserva;
	public static volatile SingularAttribute<Usuario, String> direccionUsuario;
	public static volatile SingularAttribute<Usuario, String> apellidoUsuario;
	public static volatile SingularAttribute<Usuario, String> usrUsuario;
	public static volatile SingularAttribute<Usuario, String> passUsuario;
	public static volatile SingularAttribute<Usuario, Long> id;
	public static volatile SingularAttribute<Usuario, String> nombreUsuario;
	public static volatile SingularAttribute<Usuario, String> telfUsuario;

}

