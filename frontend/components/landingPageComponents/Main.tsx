import Image from "next/image";
import Stars from "@/public/Images/landingPageImages/Main/SVG.svg"

export default function Main() {
    return(
        <div className="flex justify-center">
            <div className="flex text-xs">
                <Image src={Stars} alt="Stars"/>
                <p className="text-[var(--lightPurple)]">SEU TRABALHO, FINALMENTE ORGANIZADO</p>
            </div>
        </div>
    );
}