public class MinhaClasse {
    // classe

public static void main(String[] args) {
    // parâmetro
    System.out.println("parte 1 do teste de classe e parametro!");

    String primeiroNome = "Maria";
    String segundoNome = "Eduarda";
    String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
   
}    

public static String nomeCompleto (String primeiroNome,String segundoNome) {
    return "Resultado concatenacao:" + primeiroNome.concat(" ").concat(segundoNome);

}

}
// camelCase: toda variável composta por mais de uma palavra, a segunda sempre irá iniciar com letra maiúsculo!