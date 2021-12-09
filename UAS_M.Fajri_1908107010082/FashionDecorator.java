public class FashionDecorator implements Fashion {

	// membuat class fashion decurator yang di iplementasikan pada fashion 
	protected Fashion fashion;
	
	public FashionDecorator(Fashion c){
		this.fashion=c;
	}
	
	@Override
	public void assemble() {
		this.fashion.assemble();
	}

}