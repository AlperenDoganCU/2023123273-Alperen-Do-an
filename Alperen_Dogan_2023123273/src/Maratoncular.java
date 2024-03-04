import java.util.ArrayList;
public class Maratoncular {

    private ArrayList<String> maratoncuListesi = new ArrayList<String>();
    private ArrayList<Integer> maratoncuDerece = new ArrayList<Integer>()   ;
    private ArrayList<String> maratoncuSiralamasi = new ArrayList<String>();
    private ArrayList<Integer> maratoncuDereceSiralamasi = new ArrayList<Integer>();

    //burada degerlein private olmasi :
    // iki degiskenden birini tekil olarak degistirmemek icin var
    public void maratoncuEkleme(String isim,int derece){
        getMaratoncuListesi().add(isim);
        getMaratoncuDerece().add(derece);
        System.out.println("Sisteme: "+isim+" Derece: "+derece+" eklendi");
    }
    //buradaki sira kayit sirasi
    public void maratoncuSilme(int sira){
        String isim = getMaratoncuListesi().get(sira-1);
        int derece = getMaratoncuDerece().get(sira-1);
        getMaratoncuDerece().remove(sira-1);
        getMaratoncuListesi().remove(sira-1);
        System.out.println("Sistemden: "+isim+" Derece: "+derece+" silindi");
    }
    public void maratoncuBastir(){
        for (int i = 0; i <maratoncuListesi.size() ; i++) {
            System.out.println((i+1)+". kayıtlı maratoncu: "+ getMaratoncuListesi().get(i)+" derece: "+ getMaratoncuDerece().get(i));
        }
    }

    //kayit siralamasini ve normal siralamanin farkini gostermek icin yaptim
    public void maratoncuSiralama(){
        maratoncuSiralamasi.clear();
        maratoncuDereceSiralamasi.clear();
        String[] isimList = new String[getMaratoncuListesi().size()];
        int[] dereceList = new int[getMaratoncuDerece().size()];
        for (int i = 0; i < getMaratoncuDerece().size() ; i++) {
            isimList[i]= getMaratoncuListesi().get(i);
            dereceList[i]= getMaratoncuDerece().get(i);
        }
        int aradeger;
        String aradeger1;
        for (int i = 0; i <dereceList.length ; i++) {
            for (int j = i; j <dereceList.length ; j++) {
                if(dereceList[i]>dereceList[j]){
                    aradeger=dereceList[i];
                    dereceList[i]=dereceList[j];
                    dereceList[j]=aradeger;
                    aradeger1=isimList[i];
                    isimList[i]=isimList[j];
                    isimList[j]=aradeger1;
                }
            }
            maratoncuSiralamasi.add(isimList[i]);
            maratoncuDereceSiralamasi.add(dereceList[i]);
        }
    }
    public void maratoncuSiralamaBastir(){
        for (int i = 0; i <maratoncuSiralamasi.size() ; i++) {
            System.out.println((i+1)+". siralamaci: "+maratoncuSiralamasi.get(i)+" derece: "+maratoncuDereceSiralamasi.get(i));
        }
    }
    public int[] maratoncuDereceDizi (){
        int[] maratoncu_derece=new int[getMaratoncuDerece().size()];
        for (int i = 0; i < getMaratoncuDerece().size() ; i++) {
            maratoncu_derece[i]= getMaratoncuDerece().get(i);
        }
        return maratoncu_derece;
    }
    public int[] maratoncuSiralamaİlkUcDer(){
        int[] ilkUc=new int[3];
        for (int i = 0; i <3 ; i++) {
            ilkUc[i]=maratoncuDereceSiralamasi.get(i);
        }
        return ilkUc;
    }
    public String[] maratoncuSiralamaİlkUcİsm() {
        String[] ilkUc = new String[3];
        for (int i = 0; i < 3; i++) {
            ilkUc[i] = maratoncuSiralamasi.get(i);
        }
        return ilkUc;
    }

    public ArrayList<String> getMaratoncuListesi() {
        return maratoncuListesi;
    }

    public void setMaratoncuListesi(ArrayList<String> maratoncuListesi) {
        this.maratoncuListesi = maratoncuListesi;
    }

    public ArrayList<Integer> getMaratoncuDerece() {
        return maratoncuDerece;
    }

    public void setMaratoncuDerece(ArrayList<Integer> maratoncuDerece) {
        this.maratoncuDerece = maratoncuDerece;
    }
}
