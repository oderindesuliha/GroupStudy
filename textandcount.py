text = "Hawanat was defining a dictionary and kept repeating dict the class had to encourage her to reduce the use of the word dict"

word_count = {}

for word in text.split():
	if word in word_count:
		word_count[word] += 1
	else:
		word_count[word] = 1
	

print(word_count)