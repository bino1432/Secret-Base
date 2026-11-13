import Logo from "@/public/logo.svg";
import Image from "next/image";
import Arrow from "@/public/Images/landingPageImages/Header/arrow.svg";
import { Arimo } from "next/font/google";

const arimoBold = Arimo({
  subsets: ['latin'],
  weight: "700",
});

const arimo = Arimo({
    subsets: ['latin'],
    weight: "400",
});

export default function Header() {
    return (
        <div className="flex justify-evenly mt-4">
            <div className="flex items-center gap-3">
                <Image src={Logo} alt={"Logo"} />
                <a href="#" className={`${arimoBold.className} text-[var(--white)] text-lg`}>Secret Base</a>
            </div>
            <div className="flex items-center gap-10 text-sm">
                <a href="#" className={`${arimo.className} text-[var(--grey)] hover:text-[var(--white)] duration-300`}>Recursos</a>
                <a href="#" className={`${arimo.className} text-[var(--grey)] hover:text-[var(--white)] duration-300`}>Como funciona</a>
                <a href="#" className={`${arimo.className} text-[var(--grey)] hover:text-[var(--white)] duration-300`}>Sobre</a>
            </div>
            <div className="flex items-center gap-10 text-sm">
                <a href="#" className={`${arimo.className} text-[var(--lightGrey)] hover:text-[var(--white)] duration-300`}>Entrar</a>
                <div className="flex items-center gap-2 cursor-pointer bg-gradient-to-r from-[var(--primary)] to-[var(--darkPurple)] py-2.5 px-6 rounded-lg duration-300 hover:brightness-115 hover:-translate-y-0.5">
                    <p className={`${arimo.className} text-[var(--white)]`}>Começar grátis</p>
                    <Image src={Arrow} alt="arrow" />
                </div>
            </div>
        </div>
    );
}