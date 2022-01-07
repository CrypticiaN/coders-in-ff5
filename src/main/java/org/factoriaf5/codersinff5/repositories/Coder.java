package org.factoriaf5.codersinff5.repositories;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "coders")
public class Coder implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String appellidos;
    private String edad;
    private String pais_origen;
    private String estudios;
    private String direccion;
    private String promocion;

    public Coder() {

    }

    public Coder(String nombre, String appellidos, String edad, String pais_origen, String estudios, String direccion, String promocion) {
        this.nombre = nombre;
        this.appellidos = appellidos;
        this.edad = edad;
        this.pais_origen = pais_origen;
        this.estudios = estudios;
        this.direccion = direccion;
        this.promocion = promocion;
    }

    public Long getId() {
            return id;
        }

    public void setId(Long id) {
            this.id = id;
        }

    public String getNombre() {
            return nombre;
        }

    public void setNombre(String nombre) {
            this.nombre = nombre;
        }

    @Override
    public String toString() {
        return "Coder{" +
                 "id=" + id +
                 ", nombre'" + nombre + '\'' +
                 ", appellidos='" + appellidos + '\'' +
                 ", edad='" + edad + '\'' +
                 ", pais_origen='" + pais_origen + '\'' +
                 ", estudios='" + estudios + '\'' +
                 ", direccion='" + direccion + '\'' +
                 ", promocion='" + promocion + '\'' +
                 '}';
    }

    public String getAppellidos() {
        return appellidos;
    }

    public void setAppellidos(String appellidos) {
        this.appellidos = appellidos;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPais_origen() {
        return pais_origen;
    }

    public void setPais_origen(String pais_origen) {
        this.pais_origen = pais_origen;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPromocion() {
        return promocion;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coder coder = (Coder) o;
        return Objects.equals(id, coder.id) && Objects.equals(nombre, coder.nombre) && Objects.equals(appellidos, coder.appellidos) && Objects.equals(edad, coder.edad) && Objects.equals(pais_origen, coder.pais_origen) && Objects.equals(estudios, coder.estudios) && Objects.equals(direccion, coder.direccion) && Objects.equals(promocion, coder.promocion);
    }

    @Override
    public int hashCode() {
    return Objects.hash(id, nombre, appellidos, edad, pais_origen, estudios, direccion, promocion);
    }
}

