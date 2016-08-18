

<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@include  file="check.jsp" %>




<html>
<head>

<title>Devi Ahilya Vishavvidhyalaya, UTD(IET),INDORE</title>
</head>
<body>
<center>
<h1>STUDENT'S FEEDBACK FORM</h1>
<form action="FeedbackServlet" >
<table>
<tr><td>Program Name :</td>
    <td colspan='3' align="left">
B.E.<input type="radio"name="course"value="BE">
M.E.<input type="radio"name="course"value="ME">
M.Tech.<input type="radio"name="course"value="MTech">
M.Sc<input type="radio"name="course"value="MSc"><br>
</td></tr>
<tr><td>feedbackid</td><td><input type="text"value=""name="feedbid">
<tr><td>Faculty Name:</td><td><select name="fac">
<option>Select</option>

<option>KaminiAgrawal </option>
<option>NidhiSharma</option>
<option>DheerajMandloi</option>
<option>JitendraSingh</option>
<option>AmitGupta </option>
<option>IbrahimHussain</option>
<option>AmitKumarJha</option>
<option>RuchiSingh</option>


<option>KavitaBhesaniya</option>
<option>ChetnaSharma</option>
<option>SantoshKansal</option>
<option>AnitaParmar</option>



<option>UrviDharmasey</option>
<option>PraveenKarma</option>
<option>PratoshBansal</option>
<option>PushpaRaikwal</option>
<option>PawanMakhija</option>
<option>HarshwardhanJain</option>


<option>SufiaAziz</option>
<option>HemantMakwana</option>
<option>PratibhaSingh</option>
<option>C.P.Patidar</option>


<option>G.L.Prajapati</option>
<option>LalitGehlod</option>
<option>VrindaTokekar</option>
<option>ArpitAgrawal</option>
<option>MadhviJanglwa</option>
<option>AjayChhabadiya</option>
<option>Amit Mittal</option>

<option>AshishJain</option>
<option>VaibhavJain</option>
<option>NilimaKarankar</option>
<option>VivekKapoor</option>


<option>PragyaShukla</option>
<option>JitendraSoni</option>
<option>SwatiBhadoria</option>
<option>AmitMittal</option>

<option>RavinderKaur </option>
<option>SachinKarma</option>
<option>JagdishRaikwal</option>
<option>VisitingFaculty</option>
</select>



</td>
<td>Batch :</td><td><select name="batch">
<option>Select</option>
<option>2010</option>
<option>2011</option>
<option>2012</option>
<option>2013</option></select></td></tr><br>

<tr><td>Subject Taught:</td>
<td><select name="sub">
<option>Select</option>
<option>Applied maths1</option>
<option>Chemistry and env.</option>
<option>Elements of mech. eng.</option>
<option>Basic Electronics</option>
<option>Technical English</option>


<option>Applied maths3</option>
<option>Data structure</option>
<option>Business data processing</option>
<option>Digital electronics</option>
<option>Digital computer organization</option>
<option>Engineering economics</option>


<option>Theory of computation</option>
<option>Computer Network</option>
<option>Operating System</option>
<option>Principle of programming Lang.</option>
<option>Digital communication eng.</option>
<option>Entrepreneurship</option>
<option>Software Engineering</option>
<option>dbms</option>

<option>Artifical intelligence</option>
<option>Object Oriented Design</option>
<option>Wireless Prot.</option>
<option>Machine learning</option>
<option>Software Architecture</option>
<option>Enterprise computing tech.</option>
<option>Very large database</option>
<option></option>










    </select></td>&nbsp;&nbsp;<td>Student's CGPA /Marks%</td><td>
<input type="text"name="marks"value=""height="20" width="50"></td><br>
<tr><td>Course Code :</td>
<td><input type="text"name="code"value=""></td>&nbsp;&nbsp;<td> Percentage of class Attended</td><td><input type ="text" name="ca" value=""></td><br>


<tr><td >Date :</td>
<td ><input type="text"name="date" value=""></td>  <td> Department :</td>
<td><td><select name="department">
<option>Select</option>
<option>CS</option>
<option>IT</option>
<option>E&I </option>
<option>EC</option>
<option>IT</option>
    </select>
    

</td><br>
<hr></hr> <br>
</table>
Dear Students,
 You are requested to give your frank and objective opinion about the the teaching of faculty on under mentioned points
 It will help us to improve and maintain quality of teaching.Your respond will be kept confidential .Rank each point on a 5 point scale .
 Enter responses by choosing one option.
 <hr></hr>

<table> <tr><td>SECTION A</td>&nbsp;&nbsp;&nbsp;&nbsp;

<td>1</td>&nbsp;&nbsp;<td>2</td>&nbsp;&nbsp;<td>3</td>&nbsp;&nbsp;&nbsp;&nbsp;<td>4</td>&nbsp;&nbsp;&nbsp;&nbsp;<td>5</td></tr>

<tr><td></td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<td align="left"> very poor</td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<td>poor</td>&nbsp;&nbsp;&nbsp;&nbsp;<td>Average</td>&nbsp;&nbsp;&nbsp;&nbsp;<td>Good</td>&nbsp;&nbsp;&nbsp;&nbsp;<td>Excellent</td></tr>

<tr><td>01.Ability to bring conceptual clarity 
& peromotion of thinking ability by teacher
</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><input type="radio"name="a1"value="verypoor1"></td>&nbsp;&nbsp;<td><input type="radio"name="a1"value="poor1"></td>&nbsp;&nbsp;<td><input type="radio"name="a1"value="average1"></td>&nbsp;&nbsp;<td><input type="radio"name="a1"value="good1"></td>&nbsp;&nbsp;<td><input type="radio"name="a1"value="excellent1"></td>
<tr><td>02. Motivation provided
</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><input type="radio"name="a2"value="verypoor2"></td>&nbsp;&nbsp;<td><input type="radio"name="a2"value="poor2"></td>&nbsp;&nbsp;<td><input type="radio"name="a2"value="average2"></td>&nbsp;&nbsp;<td><input type="radio"name="a2"value="good2"></td>&nbsp;&nbsp;<td><input type="radio"name="a2"value="excellent2"></td>
<tr><td>03 Teacher's communication skills 
</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><input type="radio"name="a3"value="verypoor3"></td>&nbsp;&nbsp;<td><input type="radio"name="a3"value="poor3"></td>&nbsp;&nbsp;<td><input type="radio"name="a3"value="average3"></td>&nbsp;&nbsp;<td><input type="radio"name="a3"value="good3"></td>&nbsp;&nbsp;<td><input type="radio"name="a3"value="excellent3"></td>
<tr><td>04. Teachers regularly and punctuality
</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><input type="radio"name="a4"value="verypoor4"></td>&nbsp;&nbsp;<td><input type="radio"name="a4"value="poor4"></td>&nbsp;&nbsp;<td><input type="radio"name="a4"value="average4"></td>&nbsp;&nbsp;<td><input type="radio"name="a4"value="good4"></td>&nbsp;&nbsp;<td><input type="radio"name="a4"value="excellent4"></td>
<tr><td>05. Teacher's subject knowledge
</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><input type="radio"name="a5"value="verypoor5"></td>&nbsp;&nbsp;<td><input type="radio"name="a5"value="poor5"></td>&nbsp;&nbsp;<td><input type="radio"name="a5"value="average5"></td>&nbsp;&nbsp;<td><input type="radio"name="a5"value="good5"></td>&nbsp;&nbsp;<td><input type="radio"name="a5"value="excellent5"></td>
<tr><td>06.Completion and coverage of course
</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><input type="radio"name="a6"value="verypoor6"></td>&nbsp;&nbsp;<td><input type="radio"name="a6"value="poor6"></td>&nbsp;&nbsp;<td><input type="radio"name="a6"value="average6"></td>&nbsp;&nbsp;<td><input type="radio"name="a6"value="good6"></td>&nbsp;&nbsp;<td><input type="radio"name="a6"value="excellent6"></td>
<tr><td>07. Complements theory with practical examples
</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><input type="radio"name="a7"value="verypoor7"></td>&nbsp;&nbsp;<td><input type="radio"name="a7"value="poor7"></td>&nbsp;&nbsp;<td><input type="radio"name="a7"value="average7"></td>&nbsp;&nbsp;<td><input type="radio"name="a7"value="good7"></td>&nbsp;&nbsp;<td><input type="radio"name="a7"value="excellent7"></td>
<tr><td>08. Teachers interaction and guidance outside the classroom
</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><input type="radio"name="a8"value="verypoor8"></td>&nbsp;&nbsp;<td><input type="radio"name="a8"value="poor8"></td>&nbsp;&nbsp;<td><input type="radio"name="a8"value="average8"></td>&nbsp;&nbsp;<td><input type="radio"name="a8"value="good8"></td>&nbsp;&nbsp;<td><input type="radio"name="a8"value="excellent8"></td>
<tr><td>09. Teachers computer or IT skills (if applicable)
</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><input type="radio"name="a9"value="verypoor9"></td>&nbsp;&nbsp;<td><input type="radio"name="a9"value="poor9"></td>&nbsp;&nbsp;<td><input type="radio"name="a9"value="average9"></td>&nbsp;&nbsp;<td><input type="radio"name="a9"value="good9"></td>&nbsp;&nbsp;<td><input type="radio"name="a9"value="excellent9"></td>
<tr><td>10.Teachers overall performance
</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><input type="radio"name="a10"value="verypoor10"></td>&nbsp;&nbsp;<td><input type="radio"name="a10"value="poor10"></td>&nbsp;&nbsp;<td><input type="radio"name="a10"value="average10"></td>&nbsp;&nbsp;<td><input type="radio"name="a10"value="good10"></td>&nbsp;&nbsp;<td><input type="radio"name="a10"value="excellent10"></td>
</table>
<hr></hr>
SECTION B
<hr></hr>
<table>
<tr><td>1. Result of test declared within two weeks of it being conducted.</td>&nbsp;<td><input type="radio"name="b1"value="yes1"> Yes</td>&nbsp;&nbsp;<td><input type="radio"name="b1"value="no1"> No</td>&nbsp;&nbsp;<td><input type="radio"name="b1"value="nocomments1"> No comments</td>

<tr><td>2.Adequate number of assignments/ cases given.</td>&nbsp;<td><input type="radio"name="b2"value="yes2"> Yes</td>&nbsp;&nbsp;<td><input type="radio"name="b2"value="no2"> No</td>&nbsp;&nbsp;<td><input type="radio"name="b2"value="nocomments2"> No comments</td>

<tr><td>3.Would you recommends him /her to teach the same subject ti your juniors?</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><input type="radio"name="b3"value="yes3"> Yes</td>&nbsp;&nbsp;<td><input type="radio"name="b3"value="no3"> No</td>&nbsp;&nbsp;<td><input type="radio"name="b3"value="nocomments3"> No comments</td>

<tr><td>4.Would you recommend him/her to teach you any other bsubject?</td>&nbsp;<td><input type="radio"name="b4"value="yes4"> Yes</td>&nbsp;&nbsp;<td><input type="radio"name="b4"value="no4"> No</td>&nbsp;&nbsp;<td><input type="radio"name="b4"value="nocomments4"> No comments</td>

<tr><td>5.In your opinion is this syllabus adequate?</td>&nbsp;<td><input type="radio"name="b5"value="yes5"> Yes</td>&nbsp;&nbsp;<td><input type="radio"name="b5"value="no5"> No</td>&nbsp;&nbsp;<td><input type="radio"name="b5"value="nocomments5"> No comments</td>
</tr>
</table>
<hr></hr>
SECTION C
<hr></hr>
<table>
<tr><td>a. What are the strengths of the teacher</td><td><input type="text"name="c1"value=""width="300"></td>
<tr><td>b. What are the areas of weakness in teacher</td><td><input type="text"name="c2"value=""width="300"></td>
<tr><td>c. Any other suggestion(regarding curiculum,subjects/(s),faculty)</td><td><input type="text"name="c3"value=""width="300"></td></tr>
<tr><td colspan="2" align="center"><input type="submit" value="submit" name="insert" /></td></tr>
</table>
</center>
</form>

</body>
</html>