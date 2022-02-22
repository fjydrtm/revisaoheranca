public class Principal {
    public static void main(String[] args) {
        Empregado empregado = new Empregado();
        empregado.setNome("Aiden");
        empregado.setEndereco("Villedor");
        empregado.setTelefone("zzz");
        empregado.setSalario(1800);
        System.out.println(empregado.getNome());
        System.out.println(empregado.getEndereco());
        System.out.println(empregado.getTelefone());
        System.out.println(empregado.getSalario());
        Empregado empregado2=new Empregado();
        //settar com os seus dados
        empregado2.setNome("Enzo");
        empregado2.setEndereco("Pompeia");
        empregado2.setTelefone("xxxxx");
        empregado2.setSalario(2000);
        System.out.println(empregado2.getNome());
        System.out.println(empregado2.getEndereco());
        System.out.println(empregado2.getTelefone());
        System.out.println(empregado2.getSalario());
        
    }
}