import entities.ArtGallery;

public class Main{
    public static void main(String[] args){

         ArtGallery art1 = new ArtGallery();
         art1.setArtist("Van Gogh");
         art1.setArtwork("Starry Night");
         art1.setGallery("Gallery1");

         String artInfo = art1.toString();
         System.out.println(artInfo);

         ArtGallery art2 = new ArtGallery();
         art2.setArtist("Claude Mone");
         art2.setArtwork("Lily water");
         art2.setGallery("Gallery1");

         String art2Info = art2.toString();
         System.out.println(art2Info);

         if(art1.whatGallery() == art2.whatGallery()){
             System.out.println("In the same Gallery " + art1.whatGallery());
         }
         else{
             System.out.println("In the different Galleries");
         }
    }
}