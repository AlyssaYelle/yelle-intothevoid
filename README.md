# YELLE INTO THE VOID
Capstone project for the American Express Developer Academy. I wanted to build something very personal that I'd be motivated to maintain, so this is a website for my art.

## TIMELINE
### Wireframes
![main page](https://github.com/AlyssaYelle/yelle-intothevoid/blob/master/assets/wireframe2.png)

![user interface](https://github.com/AlyssaYelle/yelle-intothevoid/blob/master/assets/wireframe1.png)

### USER STORIES
![Gallery curators/local artists](https://github.com/AlyssaYelle/yelle-intothevoid/blob/master/assets/userstory4.png)

![My family is proud of me and wants to support me](https://github.com/AlyssaYelle/yelle-intothevoid/blob/master/assets/userstory_fam.png)

![My creative friends want to know what I'm working on](https://github.com/AlyssaYelle/yelle-intothevoid/blob/master/assets/userstory_friends.png)

![I want to maintain a website for my art that is easy to update](https://github.com/AlyssaYelle/yelle-intothevoid/blob/master/assets/userstory_me.png)


### Front End
![Basic front end layout](https://github.com/AlyssaYelle/yelle-intothevoid/blob/master/assets/frontend.png)


### Back End
![ER Diagram](https://github.com/AlyssaYelle/yelle-intothevoid/blob/master/assets/ERD.png)


### Connecting Everything
![MVC-esque diagram](https://github.com/AlyssaYelle/yelle-intothevoid/blob/master/assets/connecting.png)



## DISCUSSION
## Biggest Challenges
#### Administrative Interface
I initially struggled a lot with etting state of parent component within a child component.

#### The MODAL
Faced with a weird bug: after opening & closing modals for 2-3 images I could no longer close them. In order to get back to my main art page I had to refresh. Fixed by adding a new state to ArtImage component, rather than altering display of the modal.

## Key Takeaways
#### React is very powerful!
Handling state in my components saved me from a lot of the pain I experienced when using vanilla JavaScript/DOM manipulation

#### Microservices aren't so scary!
I basically wasted 1-2 days by building a monolithic backend first. My two separate services actually ended up being pretty intuitive to work with
