
public class Store2 {
    
        //instance fields (campos de instância)
        String productType;
        double price = 0.5;
        
        //constructor method (metodo construtor)
        public Store2 (String productType) {
            productType = productType;
        }
        
        //write a advertise method here (metodo de anunciar 1)
        public void advertiseStore(){
            System.out.println("Come spend some money");
            System.out.println("Selling" +productType+ "!");
        }
        
        //method greeCustomer (metodo 2)
        public void greetCustomerStore(String customer){
            System.out.println("Welcome to the store,"+customer+"!");
        }

        //metodo 3
        public void increasePrice(double priceToAdd){
            double newPrice = price + priceToAdd;
            price = newPrice;

        }

        //metodo 4
        public double getPriceWithTax(){
            double totalPrice = price + price * 0.08;
            return totalPrice;
        }
        
        //main method
        public static void main(String[]args) {
            Store2 product = new Store2 (" Desktop"); //metodo 1
            product.advertiseStore();
                   
            Store2 greetCustomer = new Store2 (" Laura"); //metodo 2
            product.greetCustomerStore(" Laura");

            Store2 lemonade = new Store2 (" Limonada"); //metodo 3
            lemonade.increasePrice(1);
            System.out.println(lemonade.price);

            double lemonadePrice = lemonade.getPriceWithTax();
            System.out.println(lemonadePrice);
    }
    
}
    
