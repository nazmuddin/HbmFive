package qeba.it.hbm.basictype.mappingclob;

public class MaterializedProduct{
   
   private Long id;
   private String name;
   private String warranty;

   public MaterializedProduct(){
   }
   
   public MaterializedProduct(String name, String warranty){
      this.name =name;
      this.warranty = 
   }
   
   @Id
@GeneratedValue(generator="increment")
@GenericGenerator(name="increment", strategy="increment")
   public Long getId(){
      return id;
   }

   public void setId(Long id){
      this.id =id;
   }

   public String getName(){
      return name;
   }

   public void setName(String name){
      this.name = name;
   } 
   
   @Lob
   public String getWarranty(){
      return warranty;
   }
   
   public void setWarranty(String warranty){
      this.warranty = warranty;
}
}