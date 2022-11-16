public class EventDemo
{
    public static void main(String[] args)
    {
        int nr=CarlyEvent.nr_invitati();
        CarlyEvent.motto();

        Eveniment eveniment=new Eveniment();
        CarlyEvent.event(eveniment);
        CarlyEvent.pret();


        Eveniment eveniment2=new Eveniment();
        System.out.print("Va rugam sa introduceti numaul de ivitati intre 5 si 100! ");

        System.out.print("Numarul evenimetului 1 este: "+eveniment.getEventNumber());
        System.out.print("Numarul de invitati este : "+eveniment.getInvitati());
        System.out.print("Pretul evenimetului 1 este: "+eveniment.getGuests());
        int i;
        for(i=1;i<= eveniment.getInvitati();i++)
        {
            System.out.print("Please come to my event!");
        }


        System.out.print("Numarul evenimetului 2 este: "+eveniment2.getEventNumber());
        System.out.print("Numarul de invitati este : "+eveniment2.getInvitati());
        System.out.print("Pretul evenimetului 2 este: "+eveniment2.getGuests());
        for(i=1;i<= eveniment2.getInvitati();i++)
        {
            System.out.print("Vin-o la eveniment!!");
        }

    }
}