package lab2_ethanvilleda;
public class Empleado 
{
    private String nombre;
    private String apellido;
    private String color;
    private int edad;
    private String sexo;
    private double altura;
    private double peso;
    private String titulo;
    private int cargo;
    private String car;
    private int sueldo;
    
    public Empleado(){};
    public Empleado(String nombre, String apellido, String color, int edad, char sexo, double altura, double peso, String titulo, int cargo)
    {
        this.nombre=nombre;
        this.apellido=apellido;
        this.color=color;
        this.edad=edad;
        switch(sexo)
        {
            case 'H':this.sexo="Masculino";
                break;
            case 'h': this.sexo="Masculino";
                break;
            case 'M': this.sexo="Femenino";
                break;
            case 'm': this.sexo="Femenino";
                break;
        }
        this.altura=altura;
        this.peso=peso;
        this.titulo=titulo;
        this.cargo=cargo;
        switch(cargo)
        {
            case 1: car="Gerente";
                sueldo=50000;
                break;
            case 2: car="Aseador(a)";
                sueldo=30000;
                break;
            case 3: car="Cajero(a)";
                sueldo=40000;
                break;
            case 4: car="Seguridad";
                sueldo=38000;
                break;
        }
    }
    
    
    
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    
    
    public String getApellido()
    {
        return apellido;
    }
    public void setApellido(String apellido)
    {
        this.apellido=apellido;
    }
    
    
    
    public void setColor(String color)
    {
        this.color=color;
    }
    
    
    
    public void setEdad(int edad)
    {
        this.edad=edad;
    }
    
    
    public void setSexo(char sexo)
    {
        switch(sexo)
        {
            case 'H':this.sexo="Masculino";
                break;
            case 'h': this.sexo="Masculino";
                break;
            case 'M': this.sexo="Femenino";
                break;
            case 'm': this.sexo="Femenino";
                break;
        }
    }
    
    
    public void setAltura(double altura)
    {
        this.altura=altura;
    }
    
    
    public void setPeso(double peso)
    {
        this.peso=peso;
    }
    
    
    public void setTitulo(String titulo)
    {
        this.titulo=titulo;
    }
    
    
    public int getCargo()
    {
        return cargo;
    }
    public void setCargo(int cargo)
    {
        this.cargo=cargo;
        switch(cargo)
        {
            case 1: car="Gerente";
                sueldo=50000;
                break;
            case 2: car="Aseador(a)";
                sueldo=30000;
                break;
            case 3: car="Cajero(a)";
                sueldo=40000;
                break;
            case 4: car="Seguridad";
                sueldo=38000;
                break;
        }
    }
    
    
    
    
    public String toString()
    {
        return  "Nombre: " + nombre + "\n" +
                "Apellido: " + apellido + "\n" +
                "Color favorito: " + color + "\n" +
                "Edad: " + edad + "\n" +
                "Sexo: " + sexo + "\n" +
                "Altura: " + altura + "\n" +
                "Peso: " + peso + "\n" +
                "Titulo: " + titulo + "\n" +
                "Cargo: " + car + "\n" +
                "Sueldo: " + sueldo + "\n";
    }
}
