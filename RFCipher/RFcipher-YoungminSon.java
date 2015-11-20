/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package realfence;

/**
 *
 * @author Youngmin
 */
class RFcipher {
    int strength = 2;
    private String str;
    private String str1;
    public RFcipher()
    {
      
    }
    
    public RFcipher(String s)
    {
       System.out.println("Initail String: " + s);
       String a = encrypt(s);
       System.out.println("Encrypted :" + a);
       String b = decrypt(a);
       System.out.println("Decrypted :" + b);
    }
 
    
    
    String encrypt(String str) {
  int r=strength,len=str.length();
  int c=len/strength;
  char mat[][]=new char[r][c];
  int k=0;
   
  String cipherText="";
   
  for(int i=0;i< c;i++)
  {
   for(int j=0;j< r;j++)
   {
    if(k!=len)
     mat[j][i]=str.charAt(k++);
    else
     mat[j][i]='X';
   }
  }
  for(int i=0;i< r;i++)
  {
   for(int j=0;j< c;j++)
   {
    cipherText+=mat[i][j];
   }
  }
  return cipherText;
    }

    String decrypt(String cipherText) {
         int r=strength,len=cipherText.length();
  int c=(len/strength);
  char mat[][]=new char[r][c];
  int k=0;
   
  String plainText="";
   
   
  for(int i=0;i< r;i++)
  {
   for(int j=0;j< c;j++)
   {
    mat[i][j]=cipherText.charAt(k++);
   }
  }
  for(int i=0;i< c;i++)
  {
   for(int j=0;j< r;j++)
   {
    plainText+=mat[j][i];
   }
  }
   
  return plainText;
    }
}

 

    

