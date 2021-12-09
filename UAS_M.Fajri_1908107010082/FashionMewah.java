public class FashionMewah extends FashionDecorator {

	// membuat class fashionmewah  di extend ke FashionDecorator
	public FashionMewah(Fashion c) {
		super(c);
	}
	// iplementasi sebuah overide dari sebuah method assambel yang menampil string
	@Override
	public void assemble(){
		super.assemble();
		System.out.print(" Menambahkan Fashion style Mewah.");
	}
}