from fpdf import FPDF

class PDF(FPDF):
    def header(self):
        self.set_font('Arial', 'B', 16)
        self.set_text_color(148, 30, 251)
        self.cell(0, 10, 'Ayush Raghuwanshi', 0, 1, 'C')
        self.set_font('Arial', '', 10)
        self.set_text_color(0, 0, 0)
        self.cell(0, 10, 'Bhopal, India 462010 | +919617766152 | ayushraghuwanshi283@gmail.com', 0, 1, 'C')
        self.cell(0, 10, 'LinkedIn: https://www.linkedin.com/in/ayush-raghuwanshi-248523254', 0, 1, 'C')
        self.ln(5)
        self.set_draw_color(0, 0, 0)
        self.set_line_width(0.5)
        self.line(10, self.get_y(), 200, self.get_y())
        self.ln(5)

    def chapter_title(self, title):
        self.set_font('Arial', 'B', 12)
        self.set_text_color(0, 102, 204)
        self.cell(0, 10, title, 0, 1, 'L')
        self.set_font('Arial', '', 10)
        self.set_text_color(0, 0, 0)
    
    def chapter_body(self, body):
        self.multi_cell(0, 10, body)
        self.ln()

# Create instance of PDF class
pdf = PDF()
pdf.add_page()

# Add Summary section
pdf.chapter_title('SUMMARY')
summary_text = (
    "I am a second-year B.Tech student in the Information Technology branch, consistently achieving an impressive 8 CGPA. "
    "I’ve continuously expanded my knowledge and skills in coding and development. Across languages such as HTML, CSS, JavaScript, Java, C++, "
    "and Python, I’ve delved deep into both front-end and backend projects, and my ability to conceptualize, design, and execute with precision and creativity development.\n\n"
    "I possess a solid understanding of databases and am adept at using various software development tools to streamline processes and ensure optimal efficiency. "
    "Through hands-on projects and practical applications, I’ve cultivated a problem-solving mindset essential for success in the dynamic realm of Information Technology.\n\n"
    "Beyond academics, I have embraced opportunities to gain real-world experience and expand my skill set. As a part-time event coordinator, I have cultivated valuable organizational and communication skills, "
    "effectively managing events and ensuring smooth operations.\n\n"
    "In summary, I am a dedicated and enthusiastic student with a proven track record of academic achievement and practical experience in Information Technology. "
    "With a strong foundation in coding, database management, and software development, coupled with invaluable real-world experience as an event coordinator, "
    "I am well-equipped to excel in any professional setting. Eager to embark on new challenges and opportunities, I am poised to make a significant impact and contribute to the success of any endeavor I undertake."
)
pdf.chapter_body(summary_text)

# Add Experience section
pdf.chapter_title('EXPERIENCE')
experience_text = (
    "Event Coordinator, 04/2023 - 10/2024\n"
    "Event - Bhopal, IN\n"
    "- Collaborated with clients to identify their goals and expectations from the event."
)
pdf.chapter_body(experience_text)

# Add Accomplishments section
pdf.chapter_title('ACCOMPLISHMENTS')
accomplishments_text = (
    "- Won 2nd prize in carrom competition in my university game program."
)
pdf.chapter_body(accomplishments_text)

# Add Websites, Portfolios, Profiles section
pdf.chapter_title('WEBSITES, PORTFOLIOS, PROFILES')
websites_text = (
    "GitHub: https://github.com/Ayush-Raghuwanshi-9827"
)
pdf.chapter_body(websites_text)

# Add Activities and Honors section
pdf.chapter_title('ACTIVITIES AND HONORS')
activities_text = (
    "Throughout my college journey, I have actively participated in various activities, including attending workshops and webinars. "
    "These experiences have been invaluable in expanding my knowledge and skills in my field of study. By engaging in these events, I’ve had the opportunity to learn from experts and practitioners, "
    "gaining practical insights and staying updated on the latest developments in my area of interest. These activities have not only enhanced my academic understanding but have also equipped me with valuable real-world knowledge "
    "that I can apply to my studies and future career endeavors."
)
pdf.chapter_body(activities_text)

# Add Skills section
pdf.chapter_title('SKILLS')
skills_text = (
    "- Social Media Management\n"
    "- Social Media Promotion\n"
    "- Java Database Connectivity\n"
    "- Git Version Control\n"
    "- Lambdas and Streams\n"
    "- Spring Framework\n"
    "- Servlets and JSP\n"
    "- Web Services\n"
    "- Hibernate ORM\n"
    "- Java Modules\n"
    "- Algorithm development\n"
    "- HTML5 Proficiency\n"
    "- CSS3 expertise\n"
    "- Bootstrap Framework\n"
    "- HTML templating\n"
    "- Efficient Git Version Control\n"
    "- Communication skill"
)
pdf.chapter_body(skills_text)

# Add Education and Training section
pdf.chapter_title('EDUCATION AND TRAINING')
education_text = (
    "Bachelor of Science: Information Technology, 08/2022\n"
    "University Institute of Technology Barkatullah - Bhopal\n"
    "- Online Learning from YouTube and various other platforms like HackerRank, Leetcode, GeeksForGeeks, JavaPoint, Oracle etc.\n\n"
    "High School Diploma, 05/2022\n"
    "GB Convent Hr Sec School - Bhopal\n"
    "- Ranked in Top 10% of class\n"
    "- Completed online course on YouTube (Java DSA, Spring, HTML, CSS, JavaScript)"
)
pdf.chapter_body(education_text)

# Add Languages section
pdf.chapter_title('LANGUAGES')
languages_text = (
    "English: First Language\n"
    "Hindi: Elementary (A2)"
)
pdf.chapter_body(languages_text)

# Save the document
pdf.output("Ayush_Raghuwanshi_Resume_Single_Page.pdf")
