KST Coding Assessment
=============

This project is done to fullfill the KST Coding Assessment.

The purpose of this project is to sort the list names on a txt file. Given a set of names, order that set first by last name, then by any given names the person may have. A name must have at least 1 given name and may have up to 3 given names.


Example Usage
-----

For Example Given a file called unsorted-names-list.txt containing the following list of names:

```ruby
Orson Milka Iddins
Erna Dorey Battelle
Flori Chaunce Franzel
Odetta Sue Kaspar
Roy Ketti Kopfen
Madel Bordie Mapplebeck
Selle Bellison
Leonerd Adda Mitchell Monaghan
Debra Micheli
Hailey Annakin
Leonerd Adda Micheli Monaghan
Avie Annakin
```

Executing the program in the following way:

```ruby
java com.ronald.test.SorterNames ./ununsorted-names-list.txt

"./ununsorted-names-list.txt" is the path file of the source name list data
```

Below is the example result of the sorted names:

```ruby
Avie Annakin
Hailey Annakin
Erna Dorey Battelle
Selle Bellison
Flori Chaunce Franzel
Orson Milka Iddins
Odetta Sue Kaspar
Roy Ketti Kopfen
Madel Bordie Mapplebeck
Debra Micheli
Leonerd Adda Micheli Monaghan
Leonerd Adda Mitchell Monaghan
```
The example of sorted names will be printed on the screen and stored on file "sorted-names-list.txt"
