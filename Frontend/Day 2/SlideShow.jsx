import { useState } from "react";
import "../assets/SlideShow.css";

const Slideshow = ({ images }) => {
  const [currentImageIndex, setCurrentImageIndex] = useState(0);

  const handleNext = () => {
    setCurrentImageIndex((prevIndex) =>
      prevIndex === images.length - 1 ? 0 : prevIndex + 1
    );
  };

  const handlePrev = () => {
    setCurrentImageIndex((prevIndex) =>
      prevIndex === 0 ? images.length - 1 : prevIndex - 1
    );
  };

  return (
    <div className="slideshow">
      <button onClick={handlePrev}>Previous</button>
      <img
        src={images[currentImageIndex]}
        alt={`Slideshow ${currentImageIndex + 1}`}
      />
      <button onClick={handleNext}>Next</button>
    </div>
  );
};

export default Slideshow;
