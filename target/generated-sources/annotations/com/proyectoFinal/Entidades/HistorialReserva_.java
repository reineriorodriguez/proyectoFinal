package com.proyectoFinal.Entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(HistorialReserva.class)
public abstract class HistorialReserva_ {

	public static volatile SingularAttribute<HistorialReserva, Usuario> usr;
	public static volatile SingularAttribute<HistorialReserva, Long> id;
	public static volatile SingularAttribute<HistorialReserva, Reserva> reserva;
	public static volatile SingularAttribute<HistorialReserva, Date> fechaReserva;

}

