public class EdgyFashion extends FashionDecorator {

	public EdgyFashion(Fashion c) {
		super(c);
	}
// iplementasi sebuah overide dari sebuah method assambel yang menampil string
	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Menambahkan fitur mode Edgy.");
	}
}
