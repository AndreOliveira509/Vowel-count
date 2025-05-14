/*
- Aluno: André Luis de Oliveira
- Atividade: 3 - Vowel Count
- Data: 13/05/2025
- Kata: Vowel-count

*/
public class Vowels {

  
  public static int getCount(String str) {
 int quantidadeVogais = 0;
    for(int i = 0; i < str.length(); i++){
      char ch = str.charAt(i);
      
      if (ch == 'a'){
        quantidadeVogais++;
      }
      if (ch == 'e'){
        quantidadeVogais++;
      }
      if (ch == 'i'){
        quantidadeVogais++;
      }
      if (ch == 'o'){
        quantidadeVogais++;
      }
      if (ch == 'u'){
        quantidadeVogais++;
      }
    }
    return quantidadeVogais;
  }

}
