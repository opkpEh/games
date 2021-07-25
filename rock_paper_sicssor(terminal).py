#library that we need 
import random # To generate a random number

moves = ["rock", "paper", "scissor"]#moves of the game

print("How to: wirte - \"rock\",\"paper\",\"scissor\" for you're moves!\n")#intro + help for the player
pointsToWin = int(input("Enter how many point's game do you wanna play >>  \n"))
compPoints= 0
yourPoints= 0


#Main
for i in range(pointsToWin):
    userMove= input("\n\nEnter you're move >>  \n").lower()
    
    def comp_move():
        return(random.choice(moves))

    computersMove= comp_move()
    
    print("\n\nComputer's move >>  "+computersMove+"\n")

    def calc(usermove, compmove):
        if(usermove== "rock"):
       
            if(compmove=="rock"):
                return "draw"

            elif(compmove== "paper"):
                return "1 point to computer"

            elif(compmove== "scissor"):
                return "1 point to you"

        if(usermove== "paper"):
            
            if(compmove=="paper"):
                return "draw"

            elif(compmove== "rock"):
                return "1 point to you"

            elif(compmove== "scissor"):
                return "1 point to computer"

        if(usermove== "scissor"):
            
            if(compmove=="scissor"):
                return "draw"

            elif(compmove== "rock"):
                return "1 point to computer"

            elif(compmove== "paper"):
                return "1 point to you"

    outcome= calc(userMove,computersMove)
    
    print(outcome)
    if(outcome== "1 point to computer"):
        compPoints += 1

    elif(outcome== "1 point to you"):
        yourPoints +=1
        
    else:
        print("Draw let's go again!")
        i-=1

if (yourPoints>compPoints):
    print("\n\nYou won the game!!\n")
elif (compPoints>yourPoints):
    print("\n\nYou lost :/\n")
else:
    print("\n\nDRAW\n")


#End