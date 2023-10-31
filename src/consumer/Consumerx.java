package consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Consumerx {
    public static void main(String[] args) {
        List<ProductConsumer> product = new ArrayList<>();
        product.add(new ProductConsumer(5f,"yellow",1));
        product.add(new ProductConsumer(3f,"azul",2));
        product.add(new ProductConsumer(7f,"morado",3));
        Consumer<List<ProductConsumer>> consumer = (listaproductos)->{
          for (ProductConsumer products : listaproductos){
              System.out.println("el objeto "+products.getColor()+" ,vale "+products.getPrice()+" ,y tiene de id: "+products.getId()    );
          }
        };
    }
}
