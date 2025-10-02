hash = {}

hash["milk"] = 2.99
hash["bread"] = 1.49
hash["cheese"] = 5.99
hash["eggs"] = 3.29

print("Price list:")
for key, value in hash.items():
    print(f"{key}: ${value}")
