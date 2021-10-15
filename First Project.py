print("Welcome to my first game!")
name = input("What is your name? ")
age = int(input("What is your age? "))
print("Hello", name, "you are", age, "years old")

health = 50
 

if age >= 15:
    print("you are eligible to play.......")
    player= input("Do you want to play? ").lower()
    if player == "yes":
        print("You are starting with", health, "Health")
        print("Let's play")
        print("You are lost and you are trying to find your way back home.......play the game wisely to get home")
        Direction = input("what direction do you want to go to......... left or right(left/right? ")
        if Direction == "right":
            ans = input("Nice, you are on the right path.......you walk ten metres and encountered a lake.......Do you swim or take a boat (swim/boat)? ")
            
            if ans == "swim":
                print("You swam across.... but you were bitten by a fish, so you lost 20 health.")
                health -= 20
                if health <= 0:
                    print("You now have 0 health so you've lost.........")
                else:
                    print("you survived......you can still continue")          
            
                     
            elif ans == "boat":
                print("You used the boat and you reached the other side of the lake.")
                
            ans = input("hmmmmmm..... lucky you, you passed the first stage, you are on the other side of the lake. You saw a house and an inn.....which do you go to (house/inn)?  ")
            if ans == "house":
                print("you entered the house......and got injured by the owner.......... YOU Lost 50 lives!!!!!!!!!!!")
                health -= 50
                if health <= 0:
                    print("You now have 0 health so you've lost.........")    
                else:
                    print("you survived......you can still continue")   
            elif ans == "inn":
                print("You got to the inn...and you were given foods.....thereby you gained 10 health.")
                health += 10
                print("you've gained 10 health" )
                
            ans = input("you left the inn....and got to a crossroads you saw a man staying there..... Would you ask for direction or would you go alone (ask/alone)? ")
            if ans == "ask":
             ans = input("the man advised you to take the right path............. would you obey or not (obey/disobey)? ")
            if ans == "obey":
                print("you obeyed the man.....walking down the right path you were attacked by a lion and you lost 20 health......")
                
                health -= 20
                if health <= 0:
                    print("You now have 0 health so you've lost.........")     
                else:
                    print("you survived......you can still continue")  
            if ans == "disobey":
                print("you disobeyed and took the left part........congratulations unto the level!!!!!")        
            
            ans = input('after walking through the left path.....you saw a huge forest and a valley......would you walk through the forest or the valley (forest/valley)? ')    
            if ans == "forest":
                print("you walked through the forest........and you found out that the forest wasn't as thick as it looked, you then walk up a little and you found your house......... So you've WON!!!!!!!!!!!!!!!!!!!!!!!!! ")    
            if ans == "valley":
                print("you walked in the valley, but you were swept away from the flood of a dam that just got broken.......So you've lost 50 health.  ")
                
                health -= 50
                if health <= 0:
                    print("You now have 0 health so you've lost.........") 
                else:
                    print("you survived......you can still continue") 
                           
            elif ans == "alone":
             ans = input("you decided not to ask for directions......so would you go left or right (left/right)? ")       
                
            if ans == "left":
             ans = input("after walking through the left path.....you saw a huge forest and a valley......would you walk through the forest or the valley (forest/valley)?")
            if ans == "forest":
                print("you walked through the forest........and you found out that the forest wasn't as thick as it looked, you then walk up a little and you found your house......... So you've WON!!!!!!!!!!!!!!!!!!!!!!!!! ")    
            if ans == "valley":
                print("you walked in the valley, but you were swept away from the flood of a dam that just got broken.......So you've lost 50 health.  ")
                health -= 50
                if health <= 0:
                   print("You now have 0 health so you've lost.........")             
            
            elif ans == 'right':
                print("walking down the right path you were attacked by a lion and you got killed......So you lost 30 health")
                health -= 30
                if health <= 0:
                    print("You now have 0 health so you've lost.........")
                else:
                    print("you survived......you can still continue")                 
               
        else:
            print("you encountered a tiger.......you got bitten and lost 50 health.")
            health -= 50
        
            if health <= 0:
                print("You now have 0 health so you've lost.........")    
            else:
                print("you survived......you can still continue")  
    else:
        print("Goodbye")
        
        
        
        
        
        
        
        
        
elif age >= 13:
    print("you can play with supervisison....")
    player= input("Do you want to play? ").lower()
    
    
    if player == "yes":
    
        print("Let's play, but play with supervision")
        print("You are starting with", health, "Health")
        print("You are lost and you are trying to find your way back home.......play the game wisely to get home")
        Direction = input("what direction do you want to go to......... left or right(left/right? ")
        if Direction == "right":
            ans = input("Nice, you are on the right path.......you walk ten metres and encountered a lake.......Do you swim or take a boat (swim/boat)? ")
            
            if ans == "swim":
                print("You swam across.... but you were bitten by a fish, so you lost 20 health.")
                health -= 20
            elif ans == "boat":
                print("You used the boat and you reached the other side of the lake.")
                
            ans = input("hmmmmmm..... lucky you, you passed the first stage, you are on the other side of the lake. You saw a house and an inn.....which do you go to (house/inn)?  ")
            if ans == "house":
                print("you entered the house......and got killed by the owner.......... YOU LOSE!!!!!!!!!!!")
                health -= 50
                if health <= 0:
                    print("You now have 0 health so you've lost.........")    
                else:
                    print("you survived......you can still continue")   
            elif ans == "inn":
                    print("You got to the inn...and you were given foods.....thereby you gained 10 health.")
               
            else:    
                ans = input("you left the inn....and got to a crossroads you saw a man staying there..... Would you ask for direction or would you go alone (ask/alone)? ")
            if ans == "ask":
             ans = input("the man advised you to take the right path............. would you obey or not (obey/disobey)? ")
            if ans == "obey":
                print("you obeyed the man.....walking down the right path you were attacked by a lion and you got killed......So you lost")
            if ans == "disobey":
                print("you disobeyed and took the left part........congratulations unto the level!!!!!")        
            
            ans = input('after walking through the left path.....you saw a huge forest and a valley......would you walk through the forest or the valley (forest/valley)? ')    
            if ans == "forest":
                print("you walked through the forest........and you found out that the forest wasn't as thick as it looked, you then walk up a little and you found your house......... So you've WON!!!!!!!!!!!!!!!!!!!!!!!!! ")    
            if ans == "valley":
                print("you walked in the valley, but you were swept away from the flood of a dam that just got broken.......So you've LOST!!!!!!!!!!!!!.  ") 
                   
            elif ans == "alone":
             ans = input("you decided not to ask for directions......so would you go left or right (left/right)? ")       
                
            if ans == "left":
             ans = input("after walking through the left path.....you saw a huge forest and a valley......would you walk through the forest or the valley (forest/valley)?")
            if ans == "forest":
                print("you walked through the forest........and you found out that the forest wasn't as thick as it looked, you then walk up a little and you found your house......... So you've WON!!!!!!!!!!!!!!!!!!!!!!!!! ")    
            if ans == "valley":
                print("you walked in the valley, but you were swept away from the flood of a dam that just got broken.......So you've LOST!!!!!!!!!!!!!.  ")        
            
            elif ans == 'right':
                print("walking down the right path you were attacked by a lion and you got killed......So you lost")
                        
               
        else:
            print("you encountered a sanke.......you got bitten and lost 50 health.")
            health -= 50
            if health <= 0:
                print("You now have 0 health so you've lost.........")    
            else:
                print("you survived......you can still continue")  
    else:
        print("Goodbye")
       
else:
    print("You are not eligible to play....")