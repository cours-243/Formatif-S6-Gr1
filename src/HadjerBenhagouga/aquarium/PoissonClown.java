package HadjerBenhagouga.aquarium;

public class PoissonClown extends Poisson {

    public PoissonClown(String nom, int age, String couleur) {

        super(nom, age, couleur);


    }

    @Override
    public void manger() {

        System.out.println(this.nom + " mange des frites au ketchup");
    }
}
