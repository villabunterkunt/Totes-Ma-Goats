from random import randint
with open("goat_pics",'r') as file:
    goats = file.read().split("image:")
num_of_goats = int(goats[0].strip())
choosen_billy = randint(1, num_of_goats)
print(goats[choosen_billy])
