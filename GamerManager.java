package day4hw3;

public class GamerManager implements GamerService{
	
	private UserValidationService userValidationService;
	

	public GamerManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if(userValidationService.CheckIfRealPerson(gamer)) {
			
			System.out.println("Oyuncu sisteme eklendi :" +gamer.getFirstName() + " " +gamer.getLastName());
		}else {
			
			System.out.println("Oyuncu sisteme eklenemedi:" +gamer.getFirstName() + " " +gamer.getLastName());
		}	
		
	}

	@Override
	public void delete(Gamer gamer) {
		if(userValidationService.CheckIfRealPerson(gamer)) {
			
			System.out.println("Oyuncu silindi:" +gamer.getFirstName() + " " +gamer.getLastName());
		}else {
			
			System.out.println("Oyuncu sistemde kay�tl� de�il.L�tfen �nce kay�t olunuz.");
		}
			
	}

	@Override
	public void update(Gamer gamer) {
		if(userValidationService.CheckIfRealPerson(gamer)) {
			
			System.out.println("Oyuncu g�ncellendi:" +gamer.getFirstName() + " " +gamer.getLastName());
			
		}else {
			System.out.println("Oyuncu g�ncellenemdi." +gamer.getFirstName() + " " +gamer.getLastName());
		}
		
		
	}

}
