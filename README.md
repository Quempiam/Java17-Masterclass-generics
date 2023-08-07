# Java17-Masterclass-generics

### Task description:
Make code which allows to locate object on a map. For example some National parks and rivers\
To do this:

- Create **Mappable** interface with method **render**.
- Create two classes - **Point** and **Line** - implementing **Mappable**
- Create classes extending these two: **NationalPark** extending **Point**
and **River** extending **line**.\
they should Contain location data and some additional attributes
- Create generic class **Layer** with one type parameter which is **Mappable**.\
It should have one field - list of parameters to be mapped - and a method to add elements\
Write a method called **renderLayer** that executes **render** on each element.

  Output should be similar to this:
>   Render Grand Canyon National Park as POINT ([40.10121, -754231])
 
>   Render Mississipi River as LINE ([[47.216, -95.2348], [29.1566, -89.2495], [35.1556, -90.0659]])