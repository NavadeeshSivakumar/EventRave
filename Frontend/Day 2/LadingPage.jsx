import { Link } from "react-router-dom";
import "../assets/LandingPage.css";
import gif from "../assets/hurrayred.gif";
import { useNavigate } from "react-router-dom";
import Slideshow from "./SlideShow";
import img1 from "../assets/background.jpg";
import img2 from "../assets/vector1.jpg";

const LandingPage = () => {
  const navigate = useNavigate();
  const handleContent = () => {
    navigate("/form");
  };

  return (
    <div
      id="outer"
      style={
        {
          // backgroundColor: "white"
        }
      }
    >
      <div className="landing-page">
        <header>
          <div className="container">
            <ul className="links">
              <li>
                <Link to="/about">About</Link>
              </li>
              <li>
                <Link to="/work">Work</Link>
              </li>
              <li>
                <Link to="/chat">Chat</Link>
              </li>
            </ul>
            <p className="para">“Cake, Candles and a lot of SMILES”</p>
          </div>
        </header>
        <div className="content">
          <div className="container">
            <div className="info">
              <h1>Hola</h1>
              <p>
                “Today's agenda: Eat cake, make memories, and have a blast!”
              </p>
              <button onClick={handleContent}>Your Way!</button>
            </div>
            <div className="image">
              <img
                src={gif}
                alt="Landing Page"
                style={{ height: "600px", width: "850px" }}
              />
            </div>
          </div>
        </div>
        <Slideshow images={[img1, img2]} />
      </div>
    </div>
  );
};

export default LandingPage;
