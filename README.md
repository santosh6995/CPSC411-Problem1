# CPSC411-Problem1

In this problem, you will create an Android application to display a ‘triangle’ (defined below) the height (number of layers) of which will be input by the user. Here is how the application is supposed to work. When the application is started, it shows a screen (Screen-A) where two widgets: EditText and Button widget will be displayed. User enters the number of levels in the EditText widget and click on the Button widget. Once the Button widget is clicked, the application will navigate to another screen (Screen-B) where a triangle like the below one (where 3 levels of blue-color boxes are shown as an example) is constructed and displayed at the center of the screen. The number of levels entered by user will sent from Screen-A to Screen-B and used to construct the ‘triangle’. To simplify the implementation, each box can be implemented with a TextView (or Button) widget. 



Here is the list of requirements you will implement:

1.	Develop an Android Activity to display Screen-A. (15%)
2.	Implement the custom event handling logic for the Button widget on Screen-A. The custom logic does two things. (10%)
•	Starts the Activity developed in step 3.
•	Sends ‘the number of layers’ entered on Screen-A to the Activity. 
3.	Develop an Android Activity to dynamically create and display the ‘triangle’ using the number levels entered on Screen-A.  (25%)
