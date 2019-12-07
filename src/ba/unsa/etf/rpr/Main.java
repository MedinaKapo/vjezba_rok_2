package ba.unsa.etf.rpr;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        1. Klasa Aerodrom treba da sadrži:
- Privatne atribute nazivAerodroma, grad i sifra znakovnog tipa, te sirina i duzina tipa double koje
predstavljaju geografske koordinate na kojima se nalazi aerodrom. Klasa treba slijediti JavaBean
specifikaciju.
- Potrebno je osigurati da se šifra aerodroma može sastojati isključivo od 3 velika slova engleskog
alfabeta. Ukoliko se pokuša postaviti neka drugačija šifra, potrebno je baciti izuzetak tipa
IlegalnaSifraAerodroma. Tekst izuzetka treba glasiti “Ilegalna sifra XYXY, probajte ABC”, gdje
umjesto XYXY treba staviti šifru koju je neko pokušao postaviti. U slučaju da šifra sadrži mala slova (a
inače zadovoljava sve uslove zadatka), predložena šifra ABC treba biti ista ta šifra velikim slovima. U
suprotnom, predložena šifra se treba sastojati od prva tri slova imena grada, također velikim slovima,
pri čemu ta prva tri slova sadrže razmak ili bilo šta što nije slovo engleskog alfabeta, takve ilegalne
karaktere treba izbaciti i koristiti sljedeće po redu slovo.
2. Klasa Let treba da sadrži:
- Privatne atribute: polazniAerodrom i dolazniAerodrom tipa Aerodrom, te vrijemePolaska i
vrijemeDolaska.
- Klasa također treba slijediti JavaBean specifikaciju.
- Pored standardnih metoda, klasa Let treba sadržavati i metodu trajanje koja vraća trajanje leta u
minutama kao vrijednost tipa int (pretpostaviti da su u vremenima polaska i dolaska sekunde
postavljene na nulu).
- Također treba sadržavati i metodu duzinaLeta koja vraća udaljenost između polaznog i dolaznog
aerodroma u “stepenima”. Radi jednostavnosti zadatka, pretpostavićemo da je Zemlja ravna ploča, tako
da se udaljenost između dvije tačke može izračunati koristeći uobičajenu euklidsku formulu za
udaljenost između dvije tačke, na osnovu atributa duzina i sirina klase Aerodrom. Ipak, za svaki
slučaj, obavezno je u ovoj metodi napisati komentar sljedeće sadržine: “Znam da Zemlja nije ravna
ploča, ali radi jednostavnosti ćemo koristiti euklidsku udaljenost”.
3. Klasa BrziLet predstavlja let obavljen najmodernijim supersoničnim avionima koji su tek u razvoju.
Kako bismo dočarali činjenicu da ovi avioni lete dvostruko brže, metoda duzinaLeta u ovoj klasi treba
vraćati broj dvostruko manji od onog koji bi vratila ista metoda klase Let.
4. Klasa Aviokompanija posjeduje sljedeće metode:
- Konstruktor koji prima jedan cijeli broj koji predstavlja maksimalan broj letova koji se mogu
registrirati.
- Metoda brojLetova vraća broj trenutno registrovanih letova.
- Metodu registrujLet koja kreira novu instancu klase Let i pohranjuje u nekoj internoj kolekciji.
Metoda ima parametre: polazniAerodrom, dolazniAerodrom, vrijemePolaska, vrijemeDolaska i
brzi. Prva 4 parametra imaju isti tip kao istoimeni atributi klase Let, a parametar brzi je tipa boolean i
označava da je u pitanju BrziLet. Ako je već registrovan maksimalan broj letova, metoda treba baciti
izuzetak tipa SizeLimitExceededException.
- Metoda dolazniLetovi vraća mapu (Map) u kojoj je ključ naziv grada, a vrijednost je lista (List) svih
letova koji dolaze u taj grad danas.
- Metoda uZraku vraća skup (Set) svih letova koji su bili u zraku u datom trenutku. Funkcija prima
LocalTime. Vraćeni skup treba biti sortiran po vremenu polaska.
- Metoda nadjiNajkraci prima dva stringa koji predstavljaju imena polaznog i dolaznog grada.
Funkcija treba vratiti vrijednost tipa ArrayList<Let> koja sadrži niz uzastopnih letova takvih da se iz
polaznog grada stigne do dolaznog grada. Npr. ako su primljeni parametri Sarajevo i New York, može
se vratiti niz letova: Sarajevo-Beč, Beč-London i London-New York ali pri tome voditi računa da
vrijeme dolaska prvog leta treba biti prije vremena polaska drugog leta. Ako postoji više kombinacija
letova koje ispunjavaju uslov, treba vratiti onu čija je ukupna dužina najmanja (pozivom metode
duzinaLeta). Metoda će biti bodovana sa dodatna dva boda ako se sastoji od samo jedne linije koda.
- Metoda nadjiNajbolji radi slično kao prethodna metoda, ali prima lambda funkciju kriterija po kojoj
će se tražiti najbolji let. Lambda funkcija treba da prima Let a vraća realan broj, tako da treba vratiti
onu listu letova za koje je ukupna suma vrijednosti koje je vratila funkcija najveća. Ponovo, dostupni su
bonu bodovi ako se funkcija sastoji od samo jedne linije.
         */
    }
}
