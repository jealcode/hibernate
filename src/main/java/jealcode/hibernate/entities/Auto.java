package jealcode.hibernate.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author jealcode
 */
@Entity
@Table(name = "autos")
public class Auto {

    @Id
    @GeneratedValue
    // @Column(name = "id"), NO ES NECESARIO CUANDO EL NOMBRE COINCIDE CON LA TABLA
    private Long id;
    //  @Column(name = "marca")
    private String marca;
    // @Column(name = "modelo")
    private String modelo;

    public Auto() {
    }

    public Auto(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Auto(Long id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    /**
     * @return the au_id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param au_id the au_id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the au_marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param au_marca the au_marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the au_modelo
     */
    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Auto:" + id.toString() + "," + marca + "," + modelo; //To change body of generated methods, choose Tools | Templates.
    }

}
