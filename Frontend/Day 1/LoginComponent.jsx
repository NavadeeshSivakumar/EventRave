// import { useState } from "react";
// import "../assets/LoginComponent.css";

// const LoginComponent = () => {
//   const [username, setUsername] = useState("");
//   const [password, setPassword] = useState("");

//   const handleLogin = (e) => {
//     e.preventDefault();
//     console.log("Username:", username);
//     console.log("Password:", password);
//     setUsername("");
//     setPassword("");
//   };

//   return (
//     <div id="login">
//       <h1>Login</h1>
//       <form onSubmit={handleLogin}>
//         <label htmlFor="username">Username</label>
//         <input
//           type="text"
//           id="username"
//           value={username}
//           onChange={(e) => setUsername(e.target.value)}
//         />
//         <label htmlFor="password">Password</label>
//         <input
//           type="password"
//           id="password"
//           value={password}
//           onChange={(e) => setPassword(e.target.value)}
//         />
//         <input type="submit" value="Let's Celebrate!" />
//         <p>
//           Don't have an account? <a href="/signup">Sign Up</a>
//         </p>
//       </form>
//     </div>
//   );
// };

// export default LoginComponent;

import { useState } from "react";
import { Link } from "react-router-dom";
import "../assets/LoginComponent.css";

const LoginComponent = () => {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");

  const handleLogin = (e) => {
    e.preventDefault();
    console.log("Username:", username);
    console.log("Password:", password);
    setUsername("");
    setPassword("");
  };

  return (
    <div id="login">
      <h1>Login</h1>
      <form onSubmit={handleLogin}>
        <label htmlFor="username">Username</label>
        <input
          type="text"
          id="username"
          value={username}
          onChange={(e) => setUsername(e.target.value)}
        />
        <label htmlFor="password">Password</label>
        <input
          type="password"
          id="password"
          value={password}
          onChange={(e) => setPassword(e.target.value)}
        />
        <input type="submit" value="Let's Celebrate!" />
        <p>
          Dont have an account? <Link to="/signup">Sign Up</Link>
        </p>
      </form>
    </div>
  );
};

export default LoginComponent;
