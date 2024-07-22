import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;

@DatabaseTable(tableName = "product")
public class Produto
{   
    @DatabaseField(generatedId = true)
    private int id;
    
    @DatabaseField
    private String nomeDoProduto;
    
    @DatabaseField
    private double preco;
    
    @DatabaseField
    private String marca;
    
    // Start GetterSetterExtension Source Code

    /** GET Method Propertie id */
    public int getId(){
        return this.id;
    }

    /** SET Method Propertie id */
    public void setId(int id){
        this.id = id;
    }

    /** GET Method Propertie nomeDoProduto */
    public String getNomeDoProduto(){
        return this.nomeDoProduto;
    }

    /** SET Method Propertie nomeDoProduto */
    public void setNomeDoProduto(String nomeDoProduto){
        this.nomeDoProduto = nomeDoProduto;
    }

    /** GET Method Propertie preco */
    public double getPreco(){
        return this.preco;
    }

    /** SET Method Propertie preco */
    public void setPreco(double preco){
        this.preco = preco;
    }

    /** GET Method Propertie marca */
    public String getMarca(){
        return this.marca;
    }

    /** SET Method Propertie marca */
    public void setMarca(String marca){
        this.marca = marca;
    }

    // End GetterSetterExtension Source Code
}
