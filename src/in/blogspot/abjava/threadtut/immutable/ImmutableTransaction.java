/**
 * 
 */
package in.blogspot.abjava.threadtut.immutable;

/**
 * @author dsawant
 *
 */
public final class ImmutableTransaction {
	final private String description;	// this field is object. But String is already immutable
	final private double amount;
	public ImmutableTransaction(String description, double amount) {
		this.description = description;
		this.amount = amount;
	}
	public double getAmount() {
		return amount;
	}
	/*public void setAmount(double amount) {
		this.amount = amount;
	}*/
	public String getDescription() {
		return description;
	}
	/*public void setDescription(String description) {
		this.description = description;
	}*/
}
