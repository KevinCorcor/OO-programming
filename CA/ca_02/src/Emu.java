//First (and only) Concrete Class on FlyingBird side
class Emu extends FlightlessBird{

		Emu(){
			setType("Emu");
		}
		Emu(String name){
			setName(name);
			setType("Emu");
		}
		
		void sing() {
			System.out.println("Coo Koo, I'm an E-M-uh");
		}

}
