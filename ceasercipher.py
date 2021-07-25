#written by sanskarEH  discord -THANDE_PAPA#8031  email- sanskardi123@gmail.com github-sanskarEH

print("enter the string  to encrypt")
text = input(str)
def encrypt(text,s):
    result = ""
   # transverse the plain text
    for i in range(len(text)):
      char = text[i]
      # Encrypt uppercase characters in plain text
      
      if (char.isupper()):
         result += chr((ord(char) + s-65) % 26 + 65)
      # Encrypt lowercase characters in plain text
      else:
         result += chr((ord(char) + s - 97) % 26 + 97)
    return result
#check the above function
s = 4

print ("Plain Text : " + text)
print ("Cipher: " + encrypt(text,s))

