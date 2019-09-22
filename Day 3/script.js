function validation()
    {
    var uname= document.getElementById("username").value
    var span1=document.getElementById("s1")
    var pass=document.getElementById("password").value
    var span2=document.getElementById("s2")
    if (uname.length==0)
        span1.innerHTML="<font color=red>Please enter valid username</font>"
    else
        span1.innerHTML="" 
    if (pass.length==0)
    {
        span2.innerHTML="<font color=red>Password can't be blank</font>"
        return false
    }
    else if (pass.length<6 || pass.length>12)
    {
        span2.innerHTML="<font color=red>Password should be 6 to 12 characters</font>"
        return false
    }
    else if (pass.charAt(0)!="A")
    {
        span2.innerHTML="<font color=red>First letter of password should be A</font>"
        return false
    }
    else
        span2.innerHTML=""
    }
