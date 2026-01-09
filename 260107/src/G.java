import java.math.BigDecimal;

public class G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigDecimal price = new BigDecimal("19.99");
		BigDecimal quantiry = new BigDecimal("3");
		BigDecimal taxRate = new BigDecimal("0.08");
		
		BigDecimal subtotal = price.multiply(quantiry);
		BigDecimal tax = subtotal.multiply(subtotal);
		BigDecimal total = subtotal.add(tax);
		
		System.out.println(subtotal);
		System.out.println(tax);
		System.out.println(total);
		
	}

}
